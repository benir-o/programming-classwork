package YTutorial;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String Name;
    private String Membership="Bronze";
    public static ArrayList<User> admins;
    private boolean verified=false;
    public static void printAdminNames(){
        for (User u :admins){
            System.out.println(u.getName());
        }
    }
    public User(String Name){
        setName(Name);
    }

    public User(){

    }
    public void setVerified(boolean verified){
        this.verified=verified;
    }
    public boolean verified(){
        return verified;
    }
    public String toString(){
        return getName()+" "+ getMembership();
    }
    public User(String Name,String Membership){
        setName(Name);
        setMembership(Membership);
    }
    //Overriding methods that exists in different classes.
    public boolean equals(User u2){
        if(getName()==u2.getName() && getMembership()==u2.getMembership()){
            return true;
        }
        else{
            return false;
        }

    }
    void setName(String Name){
        this.Name=Name;
    }
    // What is the hash method
    void setMembership(String Membership){
        this.Membership=Membership;
    }
    void setMembership(Membership membership){
        this.Membership=membership.name();

    }
    void verify(){
        System.out.println("Verifying...");
        setVerified(true);
    }
    String getName(){
        return Name;
    }
    String getMembership(){
        return Membership;
    }
    public enum Membership{
        Gold,Silver,Bronze;
    }



}
