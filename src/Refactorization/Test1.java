package Refactorization;

public class Test1 {
    public static void main(String[] args) {
        GenericList<Student> Strathmore=new GenericList<>(3);
        System.out.println(Strathmore.population);
        Strathmore.addStudent(new Student("Joshua",'A'));
        Strathmore.getStudent(0);
        Strathmore.getStudent(1);

    }
}
