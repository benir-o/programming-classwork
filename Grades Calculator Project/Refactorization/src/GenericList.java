import java.util.ArrayList;

public class GenericList <T> extends ArrayList {
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
    public T getEverybody(int reiterate){
        return  everybody[reiterate];
    }
    @Override
    public String toString(){
        return "Strathmore";
    }


}
