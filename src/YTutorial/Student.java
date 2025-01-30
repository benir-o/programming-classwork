package YTutorial;

import java.lang.reflect.Member;

public class Student extends User{
    private boolean verified=false;
    public Student(){

    }


    public Student(String H){
        setName(H);
    }
    public Student(String N,String M){
        setName(N);
        setMembership(M);
    }

    void verify(){
        System.out.println("Verifying through email");
        setVerified(true);
    }


}
