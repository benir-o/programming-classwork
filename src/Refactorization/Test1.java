package Refactorization;

public class Test1 {
    public static void main(String[] args) {
        GenericList<Student> Strathmore=new GenericList<>();
        Strathmore.addStudent(new Student("Joshua",'A'));
        Strathmore.getStudent(0);
    }
}
