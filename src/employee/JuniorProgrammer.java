package employee;

public class JuniorProgrammer extends Programmer {
    private boolean hasTask=false;
    String status = "junior";
    public boolean getHasTask() {
        return hasTask;
    }

    public void setHasTask(boolean hasTask) {
        this.hasTask = hasTask;
    }
    JuniorProgrammer(String name, int yearOfJoining, double salary,int workingHours, String address){
        super(name, yearOfJoining,salary, workingHours, address);
        super.addSal(salary);//ayspes el karox enq salary-n set anel
        System.out.println("Junior Programmer child param constructor");
    }

    public String getEmployeeInfo(){
        return "info  about junior programmer " + super.getName() + "," + getAddress() +"," + getUserID() + "," + this.hasTask;
    }

    public JuniorProgrammer() {
    }

    public String getParentStatus(){return super.status;}

    public String getMyStatus(){return this.status;}

}
