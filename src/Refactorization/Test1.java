package Refactorization;

public class Test1 {
    public static void main(String[] args) {
        GenericList<Student> Strathmore=new GenericList<>(2);
        Strathmore.addStudent(new Student("Alicia"));
        //System.out.println(Strathmore.getEverybody(0));
    }
}
