package homeWorkShapes;

public class Rectangle implements Shape{

    //the width of the rectangle
    private double width;

    //the height of the rectangle
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
