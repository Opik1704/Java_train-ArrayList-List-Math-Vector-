package train;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Vector{

    private double x;
    private double y;
    private double z;

    public Vector(double x_,double y_,double z_) {
        this.x = x_;
        this.y = y_;
        this.z = z_;
    }

    @Override
    public String toString() {
        return "Vector(" + x + ", " + y + ", " + z + ")";
    }

    public double get_x() {
        return x;
    }
    public double get_y() {
        return y;
    }
    public double get_z() {
        return z;
    }

    public double len() {
        double len = Math.sqrt(x*x + y * y + z * z);
        BigDecimal bd = new BigDecimal(len);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static double scalar_product(Vector vector1,Vector vector2) {
        return vector1.get_x() * vector2.get_x() + vector1.get_y() * vector2.get_y() +  vector1.get_z() * vector2.get_z();
    }

    public static Vector vector_product(Vector vector1,Vector vector2) {
        double x_vp = vector1.get_y() * vector2.get_z() -  vector1.get_z() * vector2.get_y();
        double y_vp = vector1.get_z() * vector2.get_x() - vector1.get_x() * vector2.get_z();
        double z_vp = vector1.get_x() * vector2.get_y() - vector1.get_y() * vector2.get_x();
        Vector vector_pr = new Vector(x_vp,y_vp,z_vp);
        return vector_pr;
    }
    public static double vector_product_len(Vector vector1,Vector vector2,double angle) {
        double angleRadians = Math.toRadians(angle);
        double len_vector_pr = Math.abs(vector1.len()) * Math.abs(vector2.len()) * Math.sin(angleRadians);
        return len_vector_pr;
    }

    public static double cos_vector(Vector vector1,Vector vector2) {
        double cos =  scalar_product(vector1,vector2) /
                (vector1.len() * vector2.len());
        return cos;
    }

    public static Vector summa_vector(Vector vector1,Vector vector2) {
        double x_sum = vector1.get_x() + vector2.get_x();
        double y_sum = vector1.get_y() + vector2.get_y();
        double z_sum = vector1.get_z() + vector2.get_z();
        Vector vector_sum = new Vector(x_sum,y_sum,z_sum);
        return vector_sum;
    }
    public static Vector raznost_vector(Vector vector1,Vector vector2) {
        double x_sum = vector1.get_x() - vector2.get_x();
        double y_sum = vector1.get_y() - vector2.get_y();
        double z_sum = vector1.get_z() - vector2.get_z();
        Vector vector_sum = new Vector(x_sum,y_sum,z_sum);
        return vector_sum;
    }

    public static Vector[] rand_vect(int n) {
        Vector[] mas_vect = new Vector[n];
        for(int i = 0; i < n; i++){
            mas_vect[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return mas_vect;
    }

}
