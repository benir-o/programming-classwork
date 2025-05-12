import javax.swing.*;

public class Student {
    
    protected String Name;
    protected double mark,mark1,mark2,mark3;
    protected double total;
    protected double average;
    protected char grade;
    protected int StudentID;
    final static int NUMBER_OF_TESTS=3;
    protected int population=0;

    public Student() {
        average = 50.0;
        Name = "Unknown";
        grade = 'C';
        StudentID = 555;
    }
    //Create a class consisting of
    //undergraduates, graduates and lecturers


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
        this.average=this.total/NUMBER_OF_TESTS;
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


    public static boolean verify(Student studentR) {
        if (studentR.mark1 < 0 || studentR.mark1 > 100 &&
                studentR.mark2<0 || studentR.mark2>100 &&
                studentR.mark3<0|| studentR.mark3>100) {
            return false;
        }
        return true;
    }

    public static char getGrade(Student studentR) {
        if (studentR.getAverage() < 40) {
            studentR.grade = 'F';
        } else if (studentR.getAverage() < 50) {
            studentR.grade = 'D';

        } else if (studentR.getAverage() < 60) {
            studentR.grade = 'C';
        } else if (studentR.getAverage() < 70) {
            studentR.grade = 'B';
        } else {
            studentR.grade = 'A';
        }
        return studentR.grade;

    }

    public static void displayStudents(Student[] studentRS) {
        for (int i = 0; i < studentRS.length; i++) {
            System.out.println(studentRS[i].Name + ": " + studentRS[i].getAverage() + " \t" + studentRS[i].getGrade());
        }

    }

    public static void FindAvg(Student[] studentRS) {
        String name;
        double mark1,mark2,mark3;
        double sum = 0.0;
        double classAverage;
        for (int i = 0; i < studentRS.length; i++) {
            name = JOptionPane.showInputDialog("Enter student name");
            mark1 = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam 1 mark:"));
            mark2 = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam 2 mark:"));
            mark3 = Double.parseDouble(JOptionPane.showInputDialog("Enter Exam 3 mark:"));
            studentRS[i] = new Student(name, mark1,mark2,mark3);
            if (verify(studentRS[i])) {
                Student.getGrade(studentRS[i]);
                sum = sum + studentRS[i].average;
            }else{
                JOptionPane.showMessageDialog(null, "Wrong marks input. Enter name and marks again");
                i--;
            }
        }
        classAverage = sum / studentRS.length;
        System.out.println("Class average: " + classAverage);

    }




}





