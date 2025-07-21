import java.util.Random;

public class SelectionSort {
    public void swap(int [] array, int a , int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public void sortBySelection(int[] array){
        int length= array.length;
        for (int i=0;i<length-1;i++){
            int minimum=array[i];
            int indexOfMin=i;
            for (int j=i+1;j<length;j++){
                if (array[j]<minimum){
                    minimum=array[j];
                    indexOfMin=j;
                }
            }
            swap(array,i,indexOfMin);
        }
    }

    public static void main(String[] args) {
        int [] test={5,4,2,3};
        SelectionSort s1=new SelectionSort();

        Random random=new Random();
        int [] bigArray=new int[10];
        for (int i=0;i<bigArray.length;i++){
            bigArray[i]= random.nextInt(0,10000);
        }

        s1.sortBySelection(bigArray);


        for (var k: bigArray){
            System.out.print(k+" ");
        }
    }
}
