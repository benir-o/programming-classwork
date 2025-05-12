import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while (true){
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            if (number %5==0 ){
                if (number%3==0){
                    System.out.println("FizzBuzz");
                }
                else{
                    System.out.println("Fizz");
                }
            }else if(number%5==0){
                System.out.println("Fizz");
            }
            else if (number%3==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(number);
            }


        }


    }

}
