package Refactorization;

public class Student {
    private String Name;

    private int studentNumber;

    private char grade;

    private double exam1,exam2,exam3;

    private double total;
    private double avg=total/3;
    public Student(){

    }
    public Student(String Name, char grade) {
        this.Name=Name;
        this.grade = grade;
    }

    public void FindGrade(Student s1){
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
    }
    public boolean verification(Student s2){
        if (exam1<0||exam1>100 &&
                exam2<0 || exam2>100 &&
                exam3<0 || exam3>100){
            return false;
        }
        return true;
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


    public void setGrade(char grade) {
        this.grade = grade;
    }
}
