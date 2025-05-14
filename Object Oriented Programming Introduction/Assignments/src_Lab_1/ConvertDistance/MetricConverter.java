/**
 * This class provides various routines to
 * convert metric measurements to U.S. units and
 * vice versa.
 */
package ConvertDistance;
class MetricConverter {

//----------------------------------
//    Data Members
//----------------------------------
  
  /**
   * A factor to convert inches to centimeters
   */
  public static final double INCHES_TO_CENTIMETERS = 2.54; 
   
  /**
   * A factor to convert centimeters to inches
   */
  public static final double CENTIMETERS_TO_INCHES = 1 / 2.54; 
   
  /**
   * A factor to convert feet to inches
   */
  public static final double FEET_TO_INCHES        = 12.0;
   
//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public MetricConverter( ) {
       
   }
   
//-------------------------------------------------
//  Public Methods:
// 
//      double  inchesToCentimeters        ( double         )
//      double  centimetersToInches        ( double         )
//      double  feetAndInchesToCentimeters ( double, double )
//------------------------------------------------
      
   /**
    * Converts a given length in inches to
    * equivalent centimeters.
    * 
    * @param inches  the length expressed in inches
    * @return length expressed in centimeters
    */
   public double inchesToCentimeters( double inches ) {
      return inches * INCHES_TO_CENTIMETERS;
   }
   
   /**
    * Converts a given length in feet and inches to
    * equivalent centimeters.
    * 
    * @param feet   the feet portion of the length
    * @param inches the inch portion of the length
    * @return length expressed in centimeters
    */
   public double feetAndInchesToCentimeters(double feet, double inches) {
       // Converts feet and inches to centimeters

       double calc1=feet*FEET_TO_INCHES;
       double calc2=calc1+inches;
       double calc3=inchesToCentimeters(calc2);
       return calc3;
   }
   public double centimetersToInches (double centimeters){
       //This returns the number of inches given a speciific number of centimeters
       return CENTIMETERS_TO_INCHES*centimeters;
   }
}
