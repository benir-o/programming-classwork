package Refactorization;

public class GenericList <T>{
    T[] students;
    int population;
    int count=0;
    public GenericList(int population){
        this.population=population;
        this.students=(T[])new Object[population];
    }


    public void addStudent(T student){
        students[count]=student;
        count++;
    }
    public T getStudent(int number){
        return students[number];
    }
}
