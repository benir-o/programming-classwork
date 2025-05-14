/**
 * This class provides driver objects
 * 
 */
package CarAndDriver;
class Driver {


//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public Driver( ) {

   }


//-------------------------------------------------
//      Public Methods:
// 
//          void drive();
//          
//------------------------------------------------

   /**
    * Drives a car until it is out of gas and it gets dirty 
    * along the way
    *
    * @param car - a car to drive
    */
   public void drive (Car car) {
       car.setTank("empty");
       car.setBody("dirty");
   }
}
