package actionsWithNumbers;

import java.util.Scanner;

public class ActionsWithNumbersTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println("Please provide the action to use on numbers(+-->sum,-difference,*-product) ");
        String str1 = sc.nextLine();
        String str = sc.nextLine();
        if(str.equalsIgnoreCase("sum")){
            System.out.println(ActionsWithNumbers.sumOfNumbers(a,b,c));
        }else if(str.equalsIgnoreCase("Product")){
            System.out.println(ActionsWithNumbers.prodOfNumbers(a,b,c));
        }else if(str.equalsIgnoreCase("difference")){
            System.out.println(ActionsWithNumbers.differenceOfNumbers(a,b,c));
        }else{
            System.out.println("Please enter valid action ");
        }

    }
}
