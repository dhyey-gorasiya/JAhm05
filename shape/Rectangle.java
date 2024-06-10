package shape;

public class Rectangle {
	// Data members
    protected double length;
    protected double breadth;

    // Setter methods
    public void setDimensions(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to print area
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }

    // Method to print perimeter
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
