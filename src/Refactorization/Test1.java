package Refactorization;

public class Test1 {
    public static void main(String[] args) {
        GenericList<Student> Strathmore=new GenericList<>(2);
        System.out.println(Strathmore.population);
        Student student1=new Student("Johannes");
        Student student2=new Student("Miguel");
        Strathmore.addStudent(student1);
        Strathmore.addStudent(student2);
        Strathmore.calculateStudentsDetails();
    }
}
