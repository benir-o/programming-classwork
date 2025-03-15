package Refactorization;

public class GenericList <T>{

    T[] students=(T[])new Object[3];
    int count;
    public void addStudent(T student){
        students[count]=student;
        count++;
    }
    public void getStudent(int number){
        System.out.println(students[number]);
    }
}
