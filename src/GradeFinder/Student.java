package GradeFinder;
import javax.swing.*;
import java.util.*;
public class Student {
    protected String Name;
    protected double mark;
    protected char grade;
    protected int StudentID;
    //protected double Sum;

    public Student() {
        mark = 50.0;
        Name = "Unknown";
        grade = 'C';
        StudentID = 555;
    }

    public Student(double mark) {
        setMark(mark);
    }

    public Student(String Name, double Mark) {
        setName(Name);
        setMark(Mark);
    }

    public Student(String Name, int StudentID, double Mark) {
        setName(Name);
        setMark(Mark);

    }

    void setMark(double mark) {
        this.mark = mark;
    }

    void setName(String Name) {
        this.Name = Name;
    }

    char getGrade() {
        return grade;
    }

    String getName() {
        return Name;
    }

    double getMark() {
        return mark;
    }


    public static boolean verify(Student student) {
        if (student.mark < 0 || student.mark > 100) {
            return false;
        } else {
            return true;
        }
    }

    public static char getGrade(Student student) {
        if (student.getMark() < 40) {
            student.grade = 'F';
        } else if (student.getMark() < 50) {
            student.grade = 'D';

        } else if (student.getMark() < 60) {
            student.grade = 'C';
        } else if (student.getMark() < 70) {
            student.grade = 'B';
        } else {
            student.grade = 'A';
        }
        return student.grade;

    }

    public static void displayStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].Name + ": " + students[i].getMark() + " \t" + students[i].getGrade());
        }

    }

    public static void FindAvg(Student[] students) {
        String name1;
        double mark1;
        double sum = 0.0;
        double average;
        for (int i = 0; i < students.length; i++) {
            name1 = JOptionPane.showInputDialog("Enter student name");
            mark1 = Double.parseDouble(JOptionPane.showInputDialog("Enter student Mark:"));
            students[i] = new Student(name1, mark1);
            if (verify(students[i]) == false) {
                JOptionPane.showMessageDialog(null, "Wrong marks input. Enter name and marks again");
                i--;
            } else {
                Student.getGrade(students[i]);
                sum = sum + students[i].mark;
            }


        }
        average = sum / students.length;
        System.out.println("Class average: " + average);

    }

}





