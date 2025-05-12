

public class Fibonacci {
    public static void main(String[] args) {
        int n=4;
        //We could create an array to solve the problem
        //An array to store Fibonacci cache is needed
        //Our Algorithm is still prone to a stack overflow.
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n<=1)
            return n;
        return (fibonacci(n-1)+fibonacci(n-2));
    }
}
