package geometry;

public class Sphere implements Shape {
    private Vector center;
    private double radius;
    public Sphere(double radius,Vector center){
        if(radius <=0){
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        this.center = center;
        this.radius = radius;
    }
    @Override
    public double getVolume(){
        return (4.0/3.0) * Math.PI * Math.pow(radius,2);
    }
    @Override
    public double getSurfaceArea(){
        return 4* Math.PI * Math.pow(radius,2);
    }
    @Override
    public String toString() {
        return String.format("Sphere [center=%s, r=%.2f]", center.toString(), radius);
    }
}
