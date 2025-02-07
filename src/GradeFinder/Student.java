package GradeFinder;
import javax.swing.*;

public class Student {
    protected String Name;
    protected double mark,mark1,mark2,mark3;
    protected double total;
    protected double average;
    protected char grade;
    protected int StudentID;
    protected double sum;

    public Student() {
        average = 50.0;
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
    public Student(String Name,double Mark1,double Mark2,double Mark3){
        setName(Name);
        setMark(Mark1,Mark2,Mark3);
    }

    public Student(String Name, int StudentID) {
        setName(Name);
        //setMark(Mark1,Mark2,Mark3);

    }
    void setMark(double Mark){
        this.mark=Mark;
    }

    void setMark(double mark1,double mark2, double mark3) {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        this.total=this.mark1+this.mark2+this.mark3;
        this.average=this.total/3;
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

    double getAverage() {
        return average;
    }


    public static boolean verify(Student student) {
        if (student.mark1 < 0 || student.mark1 > 100) {
            return false;
        } else if (student.mark2<0 || student.mark2>100){

            return false;
        } else if (student.mark3<0 || student.mark3>100){
            return false;
        }
        else {
            return true;
        }
    }

    public static char getGrade(Student student) {
        if (student.getAverage() < 40) {
            student.grade = 'F';
        } else if (student.getAverage() < 50) {
            student.grade = 'D';

        } else if (student.getAverage() < 60) {
            student.grade = 'C';
        } else if (student.getAverage() < 70) {
            student.grade = 'B';
        } else {
            student.grade = 'A';
        }
        return student.grade;

    }

    public static void displayStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].Name + ": " + students[i].getAverage() + " \t" + students[i].getGrade());
        }

    }

    public static void FindAvg(Student[] students) {
        String name;
        double mark1,mark2,mark3;
        double sum = 0.0;
        double classaverage;
        for (int i = 0; i < students.length; i++) {
            name = JOptionPane.showInputDialog("Enter student name");
            mark1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam 1 mark:"));
            mark2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam 1 mark:"));
            mark3 = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam 1 mark:"));
            students[i] = new Student(name, mark1,mark2,mark3);
            if (verify(students[i]) == false) {
                JOptionPane.showMessageDialog(null, "Wrong marks input. Enter name and marks again");
                i--;
            } else {
                Student.getGrade(students[i]);
                sum = sum + students[i].average;
            }


        }
        classaverage = sum / students.length;
        System.out.println("Class average: " + classaverage);

    }


}





