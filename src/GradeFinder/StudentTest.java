package GradeFinder;
import javax.swing.*;
import static GradeFinder.Student.*;

public class StudentTest {
    public static void main(String[] args) {
        int number;
        number=Integer.parseInt(JOptionPane.showInputDialog("Enter class size"));
        Student[] students=new Student[number];
        FindAvg(students);
        displayStudents(students);

    }


    }



