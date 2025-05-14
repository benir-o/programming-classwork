/**
 * This class provides a car wash for Cars
 * 
 */
package CarAndDriver;
class CarWash {


//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public CarWash( ) {

   }


//-------------------------------------------------
//      Public Methods:
// 
//          void wash();
//          
//------------------------------------------------

   /**
    * Washes a Car
    *
    * @param car - a car to fill
    */
   public void wash (Car car) {
       // set the car status to clean
      car.setBody("clean");
   }

}
