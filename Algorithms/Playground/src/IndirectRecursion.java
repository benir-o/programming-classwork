public class IndirectRecursion {
//An example of indirect recursion
    static void funcA(int n) {
        if (n > 0) {
            System.out.println("A: " + n);
            funcB(n - 1);
        }
    }

    static void funcB(int n) {
        if (n > 0) {
            System.out.println("B: " + n);
            funcA(n - 1);
        }
    }

    public static void main(String[] args) {
        funcA(4);
    }
}

