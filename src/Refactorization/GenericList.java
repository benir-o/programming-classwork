package Refactorization;

public class GenericList <T> {
    T[] everybody;
    int population;
    int count=0;
    public GenericList(int population){
        this.population=population;
        this.everybody =(T[])new Object[population];
    }
    public void addStudent(T t){
        everybody[count]= t;
        count++;
    }
    public T getStudent(int number){
        return everybody[number];
    }
    public Student getEverybody(int reiterate){
        for (int i = 0; i< reiterate; i++){


        }
        return  (Student) everybody[0];
    }
    @Override
    public String toString(){
        return "Strathmore";
    }


}
