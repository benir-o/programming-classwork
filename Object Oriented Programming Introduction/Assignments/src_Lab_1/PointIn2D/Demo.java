/** 
 * This class is used to demonstrate the functionality of the MetricConverter
 * class.
 */
package PointIn2D;

class Demo {
   public static void main (String [] args)  {
      OurPoint q  = new OurPoint (-5,-12); // Coordinates of q are (-5, 12)
      System.out.println ("The x coordinate of q is: " + q.getX());
      OurPoint testpoint= new OurPoint(2.3,-7);
      //To get the displacement between coordinates
      double xdiff,ydiff;
      double displacement;
      q.setX(6);
      q.setY(7);
      testpoint.setX(10);
      testpoint.setY(13);
      xdiff=q.getX()- testpoint.getX();
      ydiff=q.getY()- testpoint.getY();

      displacement=Math.sqrt(xdiff*xdiff + ydiff*ydiff);
      System.out.println("The displacement between point q and the test point is: "+ displacement);



   }

}
