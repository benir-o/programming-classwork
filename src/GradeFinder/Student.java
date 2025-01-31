package GradeFinder;
import javax.swing.*;
import java.util.*;
public class Student {
    protected String Name;
    protected double mark;
    protected char grade;
    protected int StudentID;
    public Student(){
        mark=50.0;
        Name="Unknown";
        grade='C';
        StudentID=555;
    }
    public Student(double mark){
        setMark(mark);
    }
    public Student(String Name,double Mark){
        setName(Name);
        setMark(Mark);
    }
    public Student(String Name,int StudentID,double Mark){
        setName(Name);
        setMark(Mark);

    }
    void setMark(double mark){
        this.mark=mark;
    }
    void setName(String Name){
        this.Name=Name;
    }
    char getGrade(){
        return grade;
    }
    String getName(){
        return Name;
    }
    double getMark(){
        return mark;
    }


    public static boolean verify(Student student){
        if (student.mark<0 || student.mark>100){
            return false;
        }
        else{
            return true;
        }
    }

    public static char getGrade(Student student){
        if (student.getMark()<40){
            student.grade='F';
        }
        else if (student.getMark()<50) {
            student.grade='D';

        }
        else if (student.getMark()<60){
            student.grade='C';
        }
        else if (student.getMark()<70){
            student.grade='B';
        }
        else{
            student.grade='A';
        }
        return student.grade;

    }

    public static void main(String[] args) {
        int number;
        double mark;
        String name;
        number=Integer.parseInt(JOptionPane.showInputDialog("Enter class population"));
        Student[] students=new Student[number];
        for (int i=0;i< students.length;i++){
            name=JOptionPane.showInputDialog("Enter Name");
            mark=Double.parseDouble(JOptionPane.showInputDialog("Enter Mark:"));
            students[i]=new Student(name,mark);
            if(Student.verify(students[i])==false){
                JOptionPane.showMessageDialog(null,"Incorrect marks. Enter marks again");
                i--;
            }
            else{
                Student.getGrade(students[i]);
            }
        }
        for (int j=0;j<students.length;j++){
            System.out.println(students[j].Name+": "+students[j].grade);
        }

    }





}
