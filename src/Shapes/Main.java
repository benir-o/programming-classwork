package Shapes;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //abstract classes cannot be instantiated
        JOptionPane myPane= new JOptionPane();
        int number=10;
        if (myPane instanceof JOptionPane){

        }
        System.out.println(myPane.getValue());
        Shape circle=new Circle(3);



    }
}
