package Essentials;

public class Main {
    public static void main(String[] args) {
        var IDandPasswords= new IDandPasswords();
        LoginPage loginPage= new LoginPage(IDandPasswords.getLoginInfo());
        IDandPasswords.getLoginInfo();
    }
}
