package employee;

public class Designer extends Employee{
    private boolean hasSpecialMonitor=true;
    public boolean getHasSpecialMonitor() {
        return hasSpecialMonitor;
    }

    public void setHasSpecialMonitor(boolean hasSpecialMonitor) {
        this.hasSpecialMonitor = hasSpecialMonitor;
    }

    public Designer(String name, int yearOfJoining, double salary, int workingHours, String address){
        super(name, yearOfJoining,salary, workingHours, address);
        System.out.println("Designer child param constructor");
    }

    public String getEmployeeInfo(){
        return "info  about designer " + super.getName() + "," + getAddress() +"," + getUserID() + "," + getHasSpecialMonitor();
    }

    public Designer() {
    }
}
