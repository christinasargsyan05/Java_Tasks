package geometric;
import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        do{
            System.out.println("Please enter the numbers ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }while (!Triangle.isValidTriangle(a,b,c));
        Triangle triangle = new Triangle(a,b,c);
        System.out.println("Perimeter of the triangle " + triangle.perimeter(a,b,c));
        System.out.println("Area of the triangle " + triangle.area(triangle.perimeter(a,b,c)));
    }
}
