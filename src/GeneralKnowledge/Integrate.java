package GeneralKnowledge;

import java.util.Scanner;

public class Integrate {

    double constant;
    double number1,number2,number3,number4;
    double max_bound;
    double min_bound;
    double exponent;
    int polynomial_degree;
    public Integrate(double constant){
        this.constant=constant;
    }
    public static void main(String[] args) {
        double a;
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter any number: ");
        a=sn.nextDouble();
        System.out.println(f(a));
    }
    public static double f(double n){
        return (Math.pow(n,2)+ (3*n) + 5);
    }
}
