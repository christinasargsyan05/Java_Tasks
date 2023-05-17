package homeWorkShapes;

public class Circle implements Shape{

    private double area;
    private double perimeter;
    @Override
    public double getArea() {
        area = Math.PI * Math.pow(radius,2);
        return area;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    //the radius of the circle
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}
