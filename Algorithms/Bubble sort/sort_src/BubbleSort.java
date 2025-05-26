public class BubbleSort {
    public static void main(String[] args) {
        int [] nums={4,2,1,3};

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-1;j++){
                if (nums[j]>nums[j+1]){
                    var temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for (int k=0;k<nums.length;k++){
            System.out.println(nums[k]);
        }
    }
}
