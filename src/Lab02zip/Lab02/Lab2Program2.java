/*
   Lab 2 Program 2: 

   File: Lab2Program2.java 
*/
package Lab02zip.Lab02;
import javax.swing.*;
//import java.awt.*;
//Import a class

public class Lab2Program2 {

    public static void main (String [] args) {
          
	String firstName;
	String lastName;
	String Mysplitter=JOptionPane.showInputDialog("Enter your Full name");
	String[] operand=Mysplitter.split(" ");
	firstName=operand[0];
	lastName=operand[1];
	JOptionPane.showMessageDialog(null,firstName.charAt(0)+"."+lastName.charAt(0)+". ");

    }
}
