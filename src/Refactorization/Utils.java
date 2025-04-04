package Refactorization;

import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Utils {
    public static void getStudentDetails(){
        var classPopulation=Integer.parseInt(JOptionPane.showInputDialog("Enter class population"));
        var stdList=new ArrayList<Student>(classPopulation);

        for (int i=0;i<classPopulation;i++){
            i++;
            String name=JOptionPane.showInputDialog("Enter student "+i +"name: ");
            stdList.add(new Student(name));
            i--;
        }
        stdList.stream().forEach(Student::inputDetails);
        stdList.stream().forEach(student-> System.out.println(student));
    }

}
