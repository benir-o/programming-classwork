package employees_personal;
public class Director extends Manager{
    private double budget;
    public Director(){

    }
    public Director(int EmployeeID,String Name, int ssn, double salary,String deptName,double budget){
        super(EmployeeID,Name,ssn,salary,deptName);
        this.budget=budget;
    }
    public double getBudget(){
        return budget;
    }
}
