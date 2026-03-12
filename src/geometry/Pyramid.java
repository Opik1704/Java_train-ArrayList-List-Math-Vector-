package geometry;

public class Pyramid implements Shape {
    private double baseSide;
    private double height;

    public Pyramid(double baseSide, double height) {
        if (baseSide <= 0 || height <= 0) {
            throw new IllegalArgumentException("Размеры должны быть положительными");
        }
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.pow(baseSide, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        double baseArea = Math.pow(baseSide, 2);
        double slantHeight = Math.sqrt(Math.pow(baseSide / 2.0, 2) + Math.pow(height, 2));
        double sideArea = 2 * baseSide * slantHeight;
        return baseArea + sideArea;
    }

    @Override
    public String toString() {
        return String.format("Pyramid [base=%.2f, height=%.2f]", baseSide, height);
    }
}