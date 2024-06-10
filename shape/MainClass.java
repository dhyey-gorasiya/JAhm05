package shape;

public class MainClass {
	public static void main(String[] args) {
        // Creating a rectangle object
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(4, 5);
        rectangle.printArea();        // Print area of the rectangle
        rectangle.printPerimeter();   // Print perimeter of the rectangle

        // Creating a square object
        Square square = new Square();
        square.setSide(4);
        square.printArea();           // Print area of the square
        square.printPerimeter();      // Print perimeter of the square
    }
}
