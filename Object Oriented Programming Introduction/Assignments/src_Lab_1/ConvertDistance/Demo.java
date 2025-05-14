package ConvertDistance;
import javax.swing.*;

/** 
 * This class is used to demonstrate the functionality of the MetricConverter
 * class.
 */

class Demo {
    
    public static void main (String[] args) {

        
        MetricConverter converter = new MetricConverter();
        
        double inputInches;
        double centimeters, inches;
        double wholeconversion;
        String inputInchesAsString;
        int inputFeet;
        
        //Get input
        inputInchesAsString = JOptionPane.showInputDialog(null, "Enter inches: ");
        inputInches =  Double.parseDouble(inputInchesAsString);
        inputFeet=Integer.parseInt(JOptionPane.showInputDialog("Enter Feet: "));
        
        //Perform various conversion routines
        centimeters = converter.inchesToCentimeters( inputInches );
        inches = converter.centimetersToInches( centimeters );
        wholeconversion=converter.feetAndInchesToCentimeters(inputFeet,inputInches);

        //Input feet and inches and convert them to centimeters

        
        //Display the result
        JOptionPane.showMessageDialog(null,"Input: "+inputFeet+" feet and "+inputInches
        +" Inches is equivalent to "+wholeconversion+" centimeters.");
        /*JOptionPane.showMessageDialog(null,
                                     "Input: " + inputInches + 
                                      " inches is equivalent to " +
                                      centimeters   + " centimeters");
        JOptionPane.showMessageDialog(null,"Total Conversion to centimeters: "+ wholeconversion);
        JOptionPane.showMessageDialog(null,
                                      "Converting back to inches: " + inches);

         */
            
    }
    
}
