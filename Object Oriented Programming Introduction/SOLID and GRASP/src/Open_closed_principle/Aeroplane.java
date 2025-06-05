package Open_closed_principle;

public class Aeroplane extends Vehicle {
    String manufacturingCompany;
    Integer engineNumbers;

    public Aeroplane(String color,Integer manufacturingYear,String manufacturingCompany,Integer engineNumbers){
        super(color,manufacturingYear);
        this.manufacturingCompany=manufacturingCompany;
        this.engineNumbers=engineNumbers;
    }
    @Override
    void accelerate() {
        System.out.println("Plane is accelerating...");
    }
    @Override
    void brake() {
        System.out.println("Plane is slowing down...");
    }
    @Override
    void start() {
        System.out.println("Plane engine started...");
    }
    @Override
    void stop() {
        System.out.println("Plane engine stopped...");
    }
}
