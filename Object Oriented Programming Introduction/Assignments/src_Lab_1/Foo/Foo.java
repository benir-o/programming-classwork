package Foo;

public class Foo {
    private static int xx;
    private int yy;

    public Foo() {
        xx = 2;
        yy = 3;
    }

    public Foo(int first, int second) {
        xx = first;
        yy = second;
    }

    public void init() {
        System.out.println("xx = " + xx);
        System.out.println("yy = " + yy);
    }

    public static void main(String[] args) {
        Foo foo1 = new Foo();
        Foo foo2 = new Foo(7, 17);

        foo1.init();
        foo2.init();

        System.out.println("done");
    }
}