/*Write a program to print the area of a rectangle by creating a separate class named 'Rectangle'.
Class should contain getter and setter methods for length and breadth of rectangle. Also methods
for calculating area(S) and perimeter(P) of the rectangle. Length and breadth of rectangle are
entered through keyboard.( Scanner class)*/
package geometric;

public class Rectangle {
    private int length;
    private int breadth;

    public int  getLength() { return length; }
    public void setLength(int _length)
    {
        length=_length;
    }

    public int  getBreadth() { return breadth; }
    public void setBreadth(int _breadth)
    {
        breadth=_breadth;
    }

    double area(){
        double area=length*breadth;
        return area;
    }
    int perimeter(){
        int perimeter=2*(length+breadth);
        return  perimeter;
    }
}
