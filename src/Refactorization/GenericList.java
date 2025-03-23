package Refactorization;

public class GenericList <Student> {
    Student[] students;
    int population;
    int count=0;
    public GenericList(int population){
        this.population=population;
        this.students=(Student[])new Object[population];
    }
    public void addStudent(Student student){
        students[count]=student;
        count++;
    }
    public Student getStudent(int number){
        return students[number];
    }
    public void calculateStudentsDetails(){
        for (int i=0;i<students.length;i++){


        }
    }
}
