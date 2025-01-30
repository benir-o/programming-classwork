package YTutorial;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        User a= new Teacher();
        Student s= new Student();
        s.setName("Angelo");
        //System.out.println(s.verified());
        //s.setMembership("Bronze");
        Teacher t= new Teacher();
        t.setName("Alicia");
        //System.out.println(t.getMembership());
        //System.out.println(s.getMembership());
        a.setName("Richarlisson");
        a.setMembership("Gold");
        User.admins=new ArrayList<User>();
        //System.out.println(a);
        //System.out.println(User.Membership.Gold);
        User b= new Student("Benir","Gold");
        //System.out.println(b.getName()+" "+User.Membership.Gold);
        User u2=new Teacher();
        u2.setName("Kylian");
        //System.out.println(u2);
        User u3=new Student("Benir","Gold");
        //System.out.println(b.equals(u3));//The output should be false
        ArrayList<User> users=new ArrayList<User>();
        //users.add(u2);
        //get the object at the first position of the list and use the getName() Method to return the name
        //which is then displayed on the screen.
        //System.out.println(users.get(0).getName());
        User.admins.add(new Student("Kyla"));
        User.admins.add(new Student("Selena"));
        User.admins.add(new Teacher("Sally"));
        User.admins.add(s);
        User.admins.add(t);
        for (User u : User.admins){
            u.verify();
        }
        //User.printAdminNames();
//        for (User u: users){
//            System.out.println(u.getName());
//        }
// Note here when we implement the second for loop, we do not need to specify the index of the first user


    }
}
