/**
 * This class provides various routines to
 * manipulate points in the coordinate plane (x, y).
 */
package PointIn2D;
public class OurPoint {

//----------------------------------
//    Data Members
//----------------------------------
  
  /**
   * The x coordinate of a point
   */
    private double xCoord;
   
  /**
   * The y coordinate of a point
   */
    private double yCoord;

//----------------------------------
//    Constructors
//----------------------------------
                                
   /**
    * Default constructor
    */
   public OurPoint( ) {
       xCoord = 0;
       yCoord = 0;
   }
   public OurPoint(double xCoord,double yCoord){
       this.xCoord=xCoord;
       this.yCoord=yCoord;
   }

   
//-------------------------------------------------
//      Public Methods:
// 
//          void setX  ( double );
//          void setY  ( double );
//          double getX ( double );
//          double getY ( double );
//------------------------------------------------
   
   /**
    * Changes the value of the x-coordinate of a point
    * 
    * 
    * @param x the new value for the x-coordinate of this point
    */
   public void setX (double x) {
       xCoord = x;
   }

   /**
    * Changes the value of the y-coordinate of a point
    * 
    * @param y the new value for the x-coordinate of this point
    */
   public void setY (double y) {
       // Sets the Y value
       yCoord=y;
   }

   /**
    * Returns the x-coordinate of a point
    * 
    * @return the x-coordinate of this point
    */
   public double getX () {
       return xCoord;
   }

   /**
    * Returns the y-coordinate of a point
    * 
    * @return the y-coordinate of this point
    */
   public double getY () {
       // this is not a stub
       return yCoord;

   }
    

    // main method used to test the OurPoint class
    //-----------------------------------------------------
    // uncomment these lines for checkpoint #6
    //-----------------------------------------------------

   public static void main (String [] args)  {
      OurPoint p  = new OurPoint (); // Coordinates of p are (0,0)
      OurPoint q  = new OurPoint (-5,-12); // Coordinates of q are (-5, 12)
      double xDiff; // the difference of the x values
      double yDiff; // the difference of the y values
      double distance; // the distance between the points

      xDiff  = p.getX() - q.getX();
      yDiff  = p.getY() - q.getY();
      distance = Math.sqrt (xDiff * xDiff + yDiff * yDiff);

      System.out.println( "Distance from (0,0) to (-5, -12) is: " + 
                           distance);
      q.setX(3);
      q.setY(4);

      xDiff  = p.getX() - q.getX();
      yDiff  = p.getY() - q.getY();

      distance = Math.sqrt (xDiff * xDiff + yDiff * yDiff);

      System.out.println( "Distance from (0,0) to (3,4) is: " + 
                           distance);
       System.out.println("The x coordinate of q is : "+q.xCoord);
   }
    // end of commented out lines
   //-----------------------------------------------------

}
