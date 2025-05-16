package Essentials;

import java.util.HashMap;

public class IDandPasswords {
    //Creating a hashmap
    HashMap<String,String> loginInfo =new HashMap<String,String>();
    IDandPasswords(){
        loginInfo.put("Bro","pizza");
        loginInfo.put("Prometheus","PASSWORD");
        loginInfo.put("Benir","Astra1");
        loginInfo.put("Hellen","ilovetea");
        loginInfo.put("Seth","12345");
    }
    protected HashMap getLoginInfo(){
        return loginInfo;
    }


}
