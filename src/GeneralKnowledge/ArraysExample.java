package GeneralKnowledge;

import java.util.Arrays;

public class ArraysExample {
    // An array is used to store multiple values in a single variable
    public int[] reversearray(int [] arr1){
        for (int i=0;i<arr1.length;i++){
            arr1[i]=arr1[arr.length-1];
        }
        return arr1;
    }

    public static void main(String[] args) {
        String[] cars={"Corvette","Tesla","Jeep"};
        cars[0]="Mustang";
        //System.out.println(cars[0]);
        //Array data types have to be consistent
        //We can initialize an array to store a fixed number of elements in the following manner.
        String[] vehicles=new String[3];
        vehicles[0]="Camaro";
        vehicles[1]="Corvette";
        vehicles[2]="Tesla";
        //We can also iterate an array using a for loop
        for(int i=0;i< vehicles.length;i++){
            System.out.println(vehicles[i]);
        }
        String[] weapons={"Ak-47","Sniper","Assault rifle"};
        String[] threats={"Close-range","Middle-range","Long-range"};
        System.out.println("Weapons: ");
        System.out.println(weapons[0]);
        System.out.println(weapons[1]);
        System.out.println(weapons[2]);
        int[] numbers={35,47,82,93};
        show(numbers);

        //show(numbers);-- Helpful if we set our "show" method to be static, so as to enable it to be visible to other members
        //of the class.
        //But how do we pass an array to a function?
        //System.out.println(ReverseArray(numbers));
        // How to print a reversed array
        System.out.println(Arrays.toString(ReverseArray(numbers)));

    }
    //A function that displays the contents of an array
    public static void show(int[] numb){
        for (int j=0;j<numb.length;j++){
            System.out.println(numb[j]);
        }
    }
    //A function that returns the reversed form of an array
    public static int[] ReverseArray(int[] array){
        int[] newarray=new int[array.length];
        for(int i=0,j=array.length-1;i<array.length;i++,j--){
            newarray[i]=array[j];
            //System.out.println(newarray[i]);
        }
        return newarray;
    }

}
