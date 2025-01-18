package Lab02zip.Lab02;
/*
   Lab 2 Program 1: 

   File: Lab2Program1.java 
*/
public class Lab2Program1 {

    public static void main (String [] args) {
          
	javax.swing.JFrame window;

        window = new javax.swing.JFrame ();
        //Adding a Comment here

        window.setSize(300,300);
        window.setTitle("My First Java Program in Lab");

        java.awt.Point position;

	position = new java.awt.Point(200,500);

        window.setLocation(position);
	window.setVisible(true);
    }
}
