package shapes;

public class Circle extends Shape{
    private double radius;
    private final double pi=3.14;
    //This keyword makes something a constant.


    @Override
    public void someMethod() {
        System.out.println("A method specified for a certain class");
    }

    public Circle(double radius){
        this.radius=radius;

    }
    public double findArea(){
        return 3.14*radius*radius;
    }
    public double findCircumference(){
        return 3.14*radius*2;
    }
}
