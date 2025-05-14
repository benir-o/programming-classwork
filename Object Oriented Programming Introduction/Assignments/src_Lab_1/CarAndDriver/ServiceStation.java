/**
 * This class provides a service station for Cars
 * 
 */
package CarAndDriver;
class ServiceStation {


//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public ServiceStation( ) {

   }


//-------------------------------------------------
//      Public Methods:
// 
//          void fill();
//          
//------------------------------------------------

   /**
    * Fills a car's tank with gas
    *
    * @param car - a car to fill
    */
   public void fill (Car car) {
       car.setTank("full");
   }

}
