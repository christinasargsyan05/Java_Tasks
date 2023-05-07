package employee;

public class Programmer extends Employee{
    private final int bonus=100;
    String status = "experienced";
    public int getBonus() {
        return bonus;
    }

    Programmer(){
        System.out.println("Child programmer constructor");
    }

    Programmer(String name, int yearOfJoining, double salary,int workingHours, String address){
        super(name, yearOfJoining,salary, workingHours, address);
        Employee.company="Company name";
        System.out.println("Programmer child param constructor");
    }


    public String getEmployeeInfo(){
        return "info  about programmer " + super.getName() + "," + getAddress() +"," + getUserID() + "," + this.getBonus();
    }

    public String toString(){return getEmployeeInfo();}

    public String getMyStatus(){return this.status;}

}
