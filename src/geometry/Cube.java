package geometry;

public class Cube implements Shape{
    private Vector center;
    private double side;

    public Cube(Vector center,double side){
        if(side <= 0){
            throw new IllegalArgumentException("Сторона куба должна быть больше 0");
        }
        this.center = center;
        this.side = side;
    }
    @Override
    public double getVolume(){
        return Math.pow(side,3);
    }
    @Override
    public double getSurfaceArea(){
        return 6 * Math.pow(side,2);
    }
    @Override
    public String toString() {
        return String.format("Cube [center=%s, side=%.2f]", center, side);
    }
}
