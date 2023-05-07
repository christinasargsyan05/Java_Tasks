package employee;

public class ProgrammerTest {
    public static void main(String[] args) {
        Programmer programmer1=new Programmer();
        Programmer programmer2=new Programmer("Jim", 2000, 3600.3,3000, "Address of Jim ");
        programmer1.getBonus();
        Employee employee1= new Employee();
        JuniorProgrammer juniorProgrammer1=new JuniorProgrammer("Kristen",2000, 4000.3,4, "Address of Kristen");
        juniorProgrammer1.addSal(1000); //Employee class-i method e
        Designer designer1= new Designer("Jerry", 3000, 4000, 4, "Address of Jerry");
        System.out.println(programmer2.toString());
        System.out.println(programmer2.getEmployeeInfo());
        System.out.println(designer1.getEmployeeInfo());

        //? Employee[] myEmployees= {programmer1, designer1, juniorProgrammer1};
        //Object class
        Object myString = "Christina";
        Object programmer3= new Programmer();
        Object[] myObjects = {myString,programmer3};

        //Polymorphism example
        Employee programmer4= new Programmer();
        Employee designer2= new Designer();
        Employee juniorProgrammer2= new JuniorProgrammer();

        //call kani ete Employee class-y uni getEmployeeInfo() method-y
        //chenq karox call anenq
        //Programmer class-i specifik metodner-y, voronq chkan Employee class-um
        //vorovhetev Eployee type-ova Programmer-y
        programmer4.getEmployeeInfo();

        //nuyn type-y unen karox enq mi array-i mej pahel
        Employee[] myEmployees= {programmer4, designer2, juniorProgrammer2};

        //Cast enq anum Employee tesaki programmerin to Programmer type
        Programmer programmer5= (Programmer) programmer4;
        //run-time error
        Programmer programmer6= (Programmer) designer2;

        Programmer programmer7= (Programmer) juniorProgrammer2;

    }
}
