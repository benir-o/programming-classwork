package Personal.OOP;

public class Employee {
    private int baseSalary;
    private int hourlyRate;
    public static int numberOfEmployees;
    public Employee(int baseSalary){
        this(baseSalary,0);
        //We can call the constructor using the 'this' keyword
    }
    public Employee(int baseSalary,int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }


    public int calculateWage(int extraHours){
        return getBaseSalary() +(getHourlyRate() *extraHours);
    }
    public static void printNumberofEmployees(){
        System.out.println(numberOfEmployees);
    }
    public int calculateWage(){
        return calculateWage(0);
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary<=0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate<0)
            throw new IllegalArgumentException("Hours cannot be less than 0");
        this.hourlyRate = hourlyRate;
    }
}
