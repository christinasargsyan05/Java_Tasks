/*Write a program to print the area and perimeter of a triangle by creating a class named 'Triangle'
with 3 parameters in its constructor.( in separate class ). Triangle sides are entered through
keyboard. Also check in the constructor that valid values are passed( Scanner class)*/
package geometric;

public class Triangle {
    private int a;
    private int b;
    private int c;

    Triangle(int _a, int _b, int _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    public static boolean isValidTriangle(int a, int b, int c) {
        //boolean isValid=true;
        System.out.printf("You entered a=%s b=%s c=%s numbers \n", a, b, c);
        if ((a + b) <= c) {
            System.out.println("You entered not valid parameters.\n Please try again ");
            return false;
        } else if ((a + c) <= b) {
            System.out.println("You entered not valid parameters.\n Please try again ");
            return false;
        } else if ((b + c) <= a) {
            System.out.println("You entered not valid parameters.\n Please try again ");
            return false;
        } else {
            System.out.println("valid sides ");
            return true;
        }
    }

    public int perimeter(int a, int b, int c) {
        int p = a + b + c;
        System.out.println("Perimeter of the triangle " + p);
        return p;
    }

    public double area(int p) {
        double halfP = p / 2;
        double area = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        System.out.println("The are of the triangle " + area);
        return area;
    }
}
