/*Write a program to calculate the sum, difference and product of two numbers by creating a class
named 'ActionsWithNumbers' with separate methods for each operation. Numbers and action
types are entered by user.( make methods static)*/
package actionsWithNumbers;
public class ActionsWithNumbers {
    public static int sumOfNumbers(int a, int b, int c){
        return (a+b+c);
    }
    public static double prodOfNumbers(int a, int b, int c){
        return (a*b*c);
    }
    static int differenceOfNumbers(int a, int b, int c){
        return (a-b-c);
    }
}
