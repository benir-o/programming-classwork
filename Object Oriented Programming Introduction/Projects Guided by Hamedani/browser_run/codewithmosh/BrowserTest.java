package codewithmosh;

public class BrowserTest {
    public static void main(String[] args) {
        var browser = new Browser();
        //A constructor is used to create a new object
        browser.navigate("...");
        var employee=new Employee(50_000,20);
        int wage=employee.calculateWage();

        //We need to implement method overloading
        //We can also overload constructors
        //instance members vs static members
        System.out.println(Employee.numberOfEmployees);


        //coupling is the level of dependency between classes


    }
}