package Foo;

public class Strange
{
    private int x;

    public Strange ()
    {
        x = 34;
    }

    public void doSomething (int x)
    {
        System.out.println (" I was passed " + x);
        this.x = x + 1;
        System.out.println (" Now I have changed it to " + x);
    }

    public int getStrangeValue ()
    {
        return x;
    }

    public static void main ( String [] args )
    {
        int x = 6;
        Strange s1 = new Strange();
        Strange s2 = new Strange();

        s1.doSomething(10);
        s2.doSomething(20);

        System.out.println( "s1 has a strange value of " + s1.getStrangeValue());
        System.out.println( "s2 has a strange value of " + s2.getStrangeValue());
    }
}
