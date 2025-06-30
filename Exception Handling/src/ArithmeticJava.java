public class ArithmeticJava {
    public static void main(String[] args) {
        int number1=100;
        try{
            int answer =number1/ 0;
            System.out.println("Answer: "+answer);
        }catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
        }finally{
            System.out.println("This just continues. Regardless");
        }
    }
}
