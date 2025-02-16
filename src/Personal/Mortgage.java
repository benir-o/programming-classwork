package Personal;
import java.nio.file.attribute.GroupPrincipal;
import java.text.NumberFormat;
import java.util.*;


public class Mortgage {
    final static byte MONTHS_IN_YEAR=12;
    final static byte PERCENT=100;
    public static void main(String[] args) {


        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        float annualInterest;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 100 && principal <= 1000000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        while (true) {
            System.out.print("Annual interest rate: ");
            annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30.");
        }
        A:
        while (true) {
            System.out.print("Period (years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                double mortgage=calculateMortgage(principal,annualInterest,years);
                String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.println();
                System.out.println("MORTGAGE");
                System.out.println("---------");
                System.out.println("Mortgage: " + mortgageFormatted);

                System.out.println("PAYMENT SCHEDULE");
                System.out.println("----------------");
                for (short month=1;month<=years*MONTHS_IN_YEAR;month++){
                    double balance=calculateBalance(principal,annualInterest,years,month);
                    System.out.println(NumberFormat.getCurrencyInstance().format(balance));
                }
                break A;
            }
        }

    }

    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade
    ) {

        float MonthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = years * MONTHS_IN_YEAR;

        double balance=principal*(Math.pow(1+MonthlyInterest,numberOfPayments)-Math.pow(1+MonthlyInterest,numberOfPaymentsMade)
        /(Math.pow(1+MonthlyInterest,numberOfPayments)-1));

        return balance;

    }
    public static double calculateMortgage(
            int principal,
            float annualInterest,
            byte years
    ){
        float monthlyInterest=annualInterest/PERCENT/MONTHS_IN_YEAR;
        float numberOfPayments=years*MONTHS_IN_YEAR;
        double mortgage=principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1)
        );
        return mortgage;
    }
}









