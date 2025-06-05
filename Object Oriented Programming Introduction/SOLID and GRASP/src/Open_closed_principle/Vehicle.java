package Open_closed_principle;

abstract public class Vehicle {
    String color;
    Integer manufacturingYear;
    /*
    In this case, our vehicle class is open for extension but closed for modification
    If we modify this class, we then have to modify all other classes that depend on it
    This causes unnecessary complications on classes and complex problems to debug, a case
    of poor design principles.
     */
    Vehicle(String color,Integer manufacturingYear){
        this.color=color;
        this.manufacturingYear=manufacturingYear;
    }
    abstract void accelerate();
    abstract void brake();
    abstract void start();
    abstract void stop();
}
