package Refactorization;

public class Test1 {
    public static void main(String[] args) {
        GenericList<Student> Strathmore=new GenericList<>(2);
        System.out.println(Strathmore.population);
//        Strathmore.addStudent(new Student("Joshua"));
//        Strathmore.getStudent(0);
//        Strathmore.getStudent(1);
        Student student1=new Student("Johannes");
        Student student2=new Student("Miguel");
//        student1.inputDetails();
        Strathmore.addStudent(student1);
        Strathmore.addStudent(student2);
    }
}
