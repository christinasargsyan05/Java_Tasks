package employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        int count=0;
        Employee[] employees=new Employee[3];
        while(count<3){
            Employee employee1=new Employee();
            employees[count]=employee1;
            count++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the name ");
        String name=sc.nextLine();
        System.out.println("Please provide the year of joining ");
        int yearOfJoining=sc.nextInt();
        System.out.println("Please provide the salary ");
        double salary=sc.nextDouble();
        String str=sc.nextLine();
        System.out.println("Please provide the working hours ");
        int workingHours=sc.nextInt();
        System.out.println("Please provide the address ");
        String address= sc.nextLine();
        Employee employee = new Employee(name, yearOfJoining,salary,workingHours,address);
        //Employee employee1 = new Employee(sc.nextLine(), yearOfJoining,salary,sc.nextInt(),address);
        Employee newEmployee1=new Employee();
        String str1=newEmployee1.getUserID();
        newEmployee1.setUserID(7);


    }
}
