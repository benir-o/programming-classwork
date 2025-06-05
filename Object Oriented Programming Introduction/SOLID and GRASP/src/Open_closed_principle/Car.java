package Open_closed_principle;

public class Car extends Vehicle{
    String make;
    Integer fuelCapacity;

    public Car(String color,Integer manufacturingYear,String make,Integer fuelCapacity){
        super(color,manufacturingYear);
        this.make=make;
        this.fuelCapacity=fuelCapacity;
    }
    @Override
    void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    void brake() {
        System.out.println("Car is slowing down...");
    }

    @Override
    void start() {
        System.out.println("Car is started...");
    }

    @Override
    void stop() {
        System.out.println("Car is stopped...");
    }
}
