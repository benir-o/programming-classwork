import javax.swing.*;

public class Student_r {
    private String Name;

    private int studentNumber;

    private char grade;

    private double exam1,exam2,exam3;

    private double total;
    private double avg;
    public static int NUMBER_OF_EXAMS=3;
    public Student_r(){

    }
    public Student_r(String Name) {
        this.Name=Name;
    }

    public char FindGrade(){
        if (avg<40){
            grade='F';
        } else if (avg<50) {
            grade='D';
        } else if (avg<60) {
            grade='C';
        }else if (avg<70){
            grade='B';
        }else{
            grade='A';
        }
        return grade;
    }
    public boolean verification(){
        if (exam1<0||exam1>100 ||
                exam2<0 || exam2>100 ||
                exam3<0 || exam3>100){
//            JOptionPane.showMessageDialog(null,"Mark range out of scope for one or more exams\nTry again..");
            return false;
        }
        return true;
    }



    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString(){
        return "Name:"+ Name+", Grade: "+ grade+", Score: "+ avg;
    }
    public double inputMarks(){
        exam1= Double.parseDouble(JOptionPane.showInputDialog("Exam 1: "));
        exam2= Double.parseDouble(JOptionPane.showInputDialog("Exam 2: "));
        exam3= Double.parseDouble(JOptionPane.showInputDialog("Exam 3: "));
        total=exam1+exam2+exam3;
        avg=total/NUMBER_OF_EXAMS;
        return Math.floor(avg);
    }
    public void inputDetails(){
        A:while (true){
            this.inputMarks();
            if (this.verification()){
                this.FindGrade();
                break A;

            }else{
                JOptionPane.showMessageDialog(null,"Mark range out of scope for one or more exams\nTry again.");
            }
        }

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public char getGrade() {
        return grade;
    }

    public double getAvg() {
        return avg;
    }

    public static void main(String[] args) {

        //Utils.getStudentDetails();
        Utils.GeneralizeStudents();

    }

}