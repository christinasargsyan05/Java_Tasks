/*Write a program by creating an 'Employee' ( in addition to previous question) class having the
following methods and print the final salary. 1 - 'getInfo()' which takes the salary, number of
Create your own automated PDFs with Jotform PDF Editor- It’s free
1
hours of work per day of employee as parameter 2 - 'AddSal()' which adds $10 to salary of the
employee if it is less than 1100. 3 - 'AddWork()' which adds $5 to salary of employee if the
number of hours of work per day is more than 6 hours.*/
package employee;

public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private int workingHours;
    private String address;
    private static int count = 0;
    private int userID;

    public static String company;

    //private Address address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        if (salary<1100){
            salary+=10;
        }
    }

    public double getSalary() {
        return salary;
    }


    Employee() {
        //count++;
        //userID = count;
        System.out.println("parent constructor ");
    }


    Employee(String _name, int _yearOfJoining, double _salary, int _workingHours, String _address) {
        name = _name;
        yearOfJoining = _yearOfJoining;
        salary = _salary;
        workingHours = _workingHours;
        address = _address;
        System.out.println("Name " + name + "\n " + "Year of Joining " + yearOfJoining + "\n " +
                "Salary " + salary + "$" + "\n " + "Working Hours " + workingHours + "\n " + "Address " + address);
    }

    void getInfo(int _salary, int _workingHours) {
        salary = _salary;
        workingHours = _workingHours;
    }

    void addSal(double _salary) {
        salary = _salary;
        if (_salary < 1100) {
            _salary += 10;
            System.out.println("10$ added to salary ");
        }
    }

    int addWork(int _workingHours, int _salary) {
        workingHours = _workingHours;
        salary = _salary;
        if (_workingHours > 6) {
            _salary += 5;
        }
        return _salary;
    }

    public String getUserID() {
        return String.valueOf(userID);
    }

    public void setUserID(int userID) {
        if (userID < 0) {
            this.userID = -userID;
        }
    }

    public String getEmployeeInfo(){
        return getName() + "," + getAddress() + getSalary() + getUserID();
    }

}

class Address {
    String address;
    String street;
    int apartment;

    Address(String _address,String street,int apartment) {
        address = _address;
        this.street=street;
        this.apartment =apartment;
    }
    Address(){}
}

