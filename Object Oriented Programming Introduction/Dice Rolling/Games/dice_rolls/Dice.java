package dice_rolls;
class Conversion{
    //Defining an attribute called a
    private int a;
    public double someNumber;
    public double convert(int num){
        double result;
        result=Math.sqrt(num);
        return result;
    }
    public void someOtherMethod(){
        someNumber=7;
    }
    //We are creating a class that is used to test the scope of variables.
    //by the way
    public void doSomething(){
        int b;
        a=7;
    }
    public void doSomeOtherthing(){
        a=6;
    }



}
public class Dice {
    private static final int MAX_NUMBER=6;
    private static final int MIN_NUMBER=1;
    private static final int NO_NUMBER=0;
    private int number;
    public Dice(){
        number=NO_NUMBER;
    }
    //The method imitating the rolling of a die.
    //Generate some random numbers
    public void roll(){
        number =(int)(Math.floor(Math.random()*6)+1);
        System.out.println(number);
        //Casting of results to an integer
    }
    public int getNumber(){
        return number;
    }
    public static void main(String[] args) {
        Dice d=new Dice();
        d.roll();
        d.roll();
        d.roll();
        d.roll();
        Conversion c= new Conversion();

    }

    //What is a local variable?

}
