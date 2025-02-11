package Personal;
import java.util.*;
public class Mortgage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int years;
        double interest;
        A:
        while (true) {
            System.out.print("Enter Principal ($1k-$1M): ");
            principal = sc.nextDouble();
            B1: if (principal < 1000 || principal > 1000000) {
                System.out.println("Enter accepted amount.");
            }else{
                A1: while (true){
                    System.out.print("Enter rate (1%-30%): ");
                    rate=sc.nextDouble();
                    B: if (rate<1 || rate>30){
                        System.out.println("Enter accepted rate");
                    }else{
                        A2: while (true){
                            rate=rate/100;
                            System.out.print("Enter number of years (1Y-30Y): ");
                            years=sc.nextInt();
                            if (years<1 || years>30){
                                System.out.println("Enter accepted timeframe.");
                            }else{
                                A3: while(true){
                                interest=principal*rate*(Math.pow(1+rate,years)/(Math.pow(1+rate,years)-1));
                                    System.out.println("The amount will have compounded to: "+(principal+interest));
                                    break A;
                                }
                            }



                        }



                    }


                }


            }






//            else{
//                System.out.print("Enter rate (1%-30%): ");
//                rate=sc.nextDouble();
//                if (rate<1 || rate >30){
//                    System.out.println("Enter the accepted rate.");
//
//                }
//                else{
//                    rate=rate/100;
//                    System.out.print("Enter number of years (1Y-30Y) ");
//                    years=sc.nextInt();
//                    if (years<1 || years>30){
//                        System.out.println("Enter accepted timeframe.");
//                    }
//                    else{
//                        interest=principal*rate*(Math.pow(1+rate,years)/(Math.pow(1+rate,years)-1));
//                        System.out.println("After "+years+"years, the money accumulated will be: "+interest);
//                        break A;
//                    }
//                }
//
//            }
//
        }


        }
    }
