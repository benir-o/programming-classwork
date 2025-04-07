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
            String name=JOptionPane.showInputDialog("Enter student "+i +" name: ");
            stdList.add(new Student(name));
            i--;
        }
        stdList.stream().forEach(Student::inputDetails);
        stdList.stream().forEach(student-> System.out.println(student));
        var avg=stdList.stream().map(m->m.getAvg()).reduce(0.0,Double::sum)/stdList.size();
        System.out.println(avg);
    }
    public static void GeneralizeStudents(){
        GenericList<Student> Strathmore=new GenericList<>(2);
        for (int i=0;i< Strathmore.population;i++){
            String name=JOptionPane.showInputDialog("Enter Student name: ");
            Strathmore.addStudent(new Student(name));
            Strathmore.getEverybody(i).inputDetails();
        }
    }

}
