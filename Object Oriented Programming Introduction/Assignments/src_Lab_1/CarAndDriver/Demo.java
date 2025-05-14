package CarAndDriver;

import java.awt.*;

public class Demo {

    public static void main (String [] args) {
	    Car rolls;
        Driver nigel;
        ServiceStation esso;

        rolls = new Car();
        nigel = new Driver(); 
        esso = new ServiceStation();

        System.out.println("Rolls: " + rolls.getStatus());


        System.out.println("Gas up the Rolls");
        esso.fill(rolls);

        System.out.println("Rolls: " + rolls.getStatus());

        System.out.println("Nigel drives the Rolls");
        nigel.drive(rolls);

        System.out.println("Rolls: " + rolls.getStatus());

        System.out.println("Clean and gas up the Rolls");
        // We instantiate an object of the carwash class and 'clean the car'
        // We then refill the tank and display the status once again


        System.out.println("Rolls: " + rolls.getStatus());
        System.out.println("Cleaning up Rolls..");
        CarWash mycar=new CarWash();
        mycar.wash(rolls);
        System.out.println("Gassing up Rolls...");
        esso.fill(rolls);
        System.out.println("Rolls: "+rolls.getStatus());

    }
}
