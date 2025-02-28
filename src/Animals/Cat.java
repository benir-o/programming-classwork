package Animals;

public class Cat extends Animal{
    String catFoodPreference;
    public Cat(){

    }
    public Cat(int age, String name, String catFoodPreference){
        super(age,name);
        this.catFoodPreference=catFoodPreference;
    }

    @Override
    public void makenoise(){
        System.out.println("meow meow meow....");
        eat();
    }
}
