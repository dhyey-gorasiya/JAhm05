package Example;

class Area {
    private double length;
    private double breadth;

    public Area() {
        this.length = 5.0;
        this.breadth = 5.0;
    }

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Area rectangle1 = new Area(5.0, 10.0);
        double area1 = rectangle1.getArea();
        System.out.println("The area of the rectangle is: " + area1);

        Area rectangle2 = new Area();
        double area2 = rectangle2.getArea();
        System.out.println("The area of the default rectangle is: " + area2);
    }
}
