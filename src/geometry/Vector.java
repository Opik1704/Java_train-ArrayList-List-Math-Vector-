package geometry;

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

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }


    public double len() {
        double len = Math.sqrt(x*x + y * y + z * z);
        BigDecimal bd = new BigDecimal(len);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public static Vector add(Vector vector1,Vector vector2) {
        double x_sum = vector1.getX() + vector2.getX();
        double y_sum = vector1.getY() + vector2.getY();
        double z_sum = vector1.getZ() + vector2.getZ();
        Vector vector_sum = new Vector(x_sum, y_sum, z_sum);
        return vector_sum;
    }

    public static Vector subtract(Vector vector1,Vector vector2) {
        double x_sum = vector1.getX() - vector2.getX();
        double y_sum = vector1.getY() - vector2.getY();
        double z_sum = vector1.getZ() - vector2.getZ();
        Vector vector_sum = new Vector(x_sum,y_sum,z_sum);
        return vector_sum;
    }

    public Vector multiply(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
    }


    public static double scalarProduct(Vector vector1,Vector vector2) {
        return vector1.getX() * vector2.getX() + vector1.getY() * vector2.getY() +  vector1.getZ() * vector2.getZ();
    }

    public static Vector vectorProduct(Vector vector1,Vector vector2) {
        double x_vp = vector1.getY() * vector2.getZ() -  vector1.getZ() * vector2.getY();
        double y_vp = vector1.getZ() * vector2.getX() - vector1.getX() * vector2.getZ();
        double z_vp = vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX();
        Vector vector_pr = new Vector(x_vp,y_vp,z_vp);
        return vector_pr;
    }

    public static double vectorProductLen(Vector vector1,Vector vector2,double angle) {
        double angleRadians = Math.toRadians(angle);
        return vector1.len() * vector2.len() * Math.sin(angleRadians);
    }


    public static double cosVector(Vector vector1,Vector vector2) {
        return scalarProduct(vector1,vector2) / (vector1.len() * vector2.len());
    }

    public static double angleBetween(Vector v1, Vector v2) {
        double cos = cosVector(v1, v2);
        cos = Math.max(-1, Math.min(1, cos));
        return Math.toDegrees(Math.acos(cos));
    }


    public double distanceTo(Vector other) {
        return Math.sqrt(
                Math.pow(this.x - other.x, 2) +
                        Math.pow(this.y - other.y, 2) +
                        Math.pow(this.z - other.z, 2)
        );
    }

    public Vector normalize() {
        double length = len();
        if (length == 0) return new Vector(0, 0, 0);
        return new Vector(x / length, y / length, z / length);
    }

    public static Vector[] randVector(int n) {
        Vector[] mas_vect = new Vector[n];
        for(int i = 0; i < n; i++){
            mas_vect[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return mas_vect;
    }


    @Override
    public String toString() {
        return String.format("Vector(x: %.2f, y: %.2f, z: %.2f)", x, y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        double eps = 1e-9;
        return Math.abs(vector.x - x) < eps &&
                Math.abs(vector.y - y) < eps &&
                Math.abs(vector.z - z) < eps;
    }

}
