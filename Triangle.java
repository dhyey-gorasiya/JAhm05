package geometry;

public class Triangle {
    private double A;
    private double B;
    private double C;

    public Triangle(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getArea() {
        double s = (A + B + C) / 2;
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    public double getPerimeter() {
        return A + B + C;
    }
}
