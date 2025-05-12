public class Animal {
    int age;
    String name;
    public Animal(){
        }
    public Animal(int age, String name){
        this.age=age;
        this.name=name;
    }


    public void makenoise(){
        System.out.println("Hello, I am an animal");
    }
    public void eat(){
        System.out.println("munch munch...");
    }
    private void doSomethingPrivate(){
        System.out.println("Hey this is a private method");
    }
}

