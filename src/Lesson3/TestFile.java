package Lesson3;

public class TestFile {
    public static void main(String[] args) {
        System.out.println("This is the test File");
        //Create an instance of the Employee Class
        //Employee emp1=new Employee();
        Engineer e1=new Engineer(101,"Jane Smith",012-34-5678,120345.27);
        Manager m1= new Manager(207,"Barbara Johnson",054-12-2367,109501.36,"US Marketing");
        Admin a1=new Admin(304,"Bill Monroe",108-23-6509,75002.34);
        Director d1=new Director(12,"Susan Wheeler",99-45-2340,120567.36,"Global Marketing",1000000);
//        printEmployee(e1);
//        printEmployee(m1);
//        printEmployee(a1);
//        printEmployee(d1);
//        System.out.println(m1.toString());
        System.out.println(m1);
        //As you can see, when we want to print something, the toString method is automatically told
        //We get some output here that is kind of cryptic
        //We need to override the method to avoid the gibberish
        // To print out class information
//        m1.setName("Peter Ndegwa");
//        m1.raiseSalary(24000);
//        printEmployee(m1);

    }
    public static void printEmployee(Employee emp){
        System.out.println("Employee ID: "+ emp.getID());
        System.out.println("Employee Name: "+ emp.getName());
        System.out.println("Security Number: "+emp.getSSN());
        System.out.println("Employee Salary: "+emp.getSalary());

    }
}
