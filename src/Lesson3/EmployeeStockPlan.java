package Lesson3;

public class EmployeeStockPlan {
    //A method that takes an employee object reference as a parameter
    //What is the instance of operator?
    public int grantStock(Employee e) {
        if (e instanceof Manager){
            return 100;
        }
        return 0;
    }
}
