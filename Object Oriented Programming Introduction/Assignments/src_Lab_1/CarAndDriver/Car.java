/**
 * This class provides car objects that have  "full" or "empty" tanks
 * and are "clean" or "dirty".
 */
package CarAndDriver;
class Car {

//----------------------------------
//    Data Members
//----------------------------------

  /**
   * The tank is "full" or "empty"
   */
  private String tank;
   
  /**
   * The body is "clean" or "dirty"
   */
  private String body;

//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public Car( ) {
       tank = "empty";
       body = "clean";
   }


//-------------------------------------------------
//      Public Methods:
// 
//          void setBody();
//          void setTank();
//          String getStatus();
//          
//------------------------------------------------

   /**
    * Changes the condition of the car body
    * 
    * @param state - state of the car body (clean or dirty)
    */
   public void setBody (String state) {
       body = state;
   }


   /**
    * Changes the gas level in the car's tank (empty or full)
    * 
    * @param level - gas level in the car's tank (empty or full)
    */
   public void setTank (String level) {
       tank = level;
   }

   /**
    * Returns a String that reports the condition of the car
    * 
    * @return - car status
    */
   public String getStatus () {
       return "tank is " + tank + ", body is " + body;
   }
}
