package YTutorial.Moshcode.Introduction;
import java.util.*;
import javax.swing.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        byte age=30;
        //Primitive types do not have members while Reference types do have members
        Date now=new Date();
        //An instance of the date class
        //System.out.println(now.getTime());

        // short type has 2 bytes while int stores 4 variables.
        // So any variable that stores 4 bytes can also store 2 bytes
        //This is called implicit casting
        short x=1;
        int y=x+2;
        System.out.println(y);
        //byte> short >int>long>float>double
        double x1=1.1;
        int y1= (int)x1+2;
        //What is a wrapper class?
        //Integer is the wrapper class for the primitive type

        //Math.round(int a), Math.ceil(double a), Math.floor(double c), Math.max(int a, int b)
        //Math.random() returns a floating point number between 0 and 1
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal=s1.nextDouble();
        System.out.print("Enter rate: ");
        double rate=s1.nextDouble();
        System.out.print("Enter number of years:");
        int years=s1.nextInt();
        double amt=principal*rate*(Math.pow(1+rate,years)/(Math.pow(1+rate,years)-1));
        System.out.println("$"+amt);
        //What about the Ternary operator?
        double income=40000;
        String className=income>100_000 ? "First": "Economy";
        String role="Admin";
        switch (role){
            case "Admin":
                System.out.println("You are an administrator");
                break;
            case "Moderator":
                System.out.println("You are moderator");
            default:
                System.out.println("You are a moderator");
        }




    }
}
