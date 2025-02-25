package Interfaces;

public class iPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Making a phone call using apple devices");
    }
    // all must adhere to the contract of the interface we have created
    //common code vs commone behaviour
    // We use classes to share common code
    //We use interfaces to share common behaviour
    @Override
    public void sendMessage() {
        System.out.println("How the iPhone device sends messages");
    }
}
