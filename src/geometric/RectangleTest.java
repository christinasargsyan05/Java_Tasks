package geometric;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec= new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of the rectangle ");
        int length = sc.nextInt();
        System.out.println("Please enter the breadth of the rectangle ");
        int breadth = sc.nextInt();
        rec.setBreadth(breadth);
        rec.setLength(length);
        System.out.println(rec.perimeter());
        System.out.println(rec.area());
    }
}
