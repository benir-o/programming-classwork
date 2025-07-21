public class BubbleSort {
    static void swap(int[] array, int index1,int index2){
        var temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    public static void main(String[] args) {
        int [] nums={4,2,1,3};

        boolean isSorted;
        for (int i=0;i<nums.length;i++){
            isSorted=true;
            for (int j=0;j<(nums.length-1)-i;j++){
                if (nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                    isSorted=false;
                }
            }
            if (isSorted){
                break;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }
        //Attempt 2
        for (int i=0;i<nums.length;i++){
            boolean sorted=true;
            for (int j=0;j<(nums.length-1)-i;j++){
                if (nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    sorted=false;
                }
            }
            if(sorted){
                break;
            }
        }
        for (var num1: nums){
            System.out.print(num1+" ");
        }
    }
}
