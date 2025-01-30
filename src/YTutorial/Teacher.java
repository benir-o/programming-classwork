package YTutorial;

public class Teacher extends User{
    String Name;

    public Teacher(){

    }
    public Teacher(String K){
        setName(K);
    }


    void verify(){
        System.out.println("Verifying through phone");
        setVerified(true);
    }

}
