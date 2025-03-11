package GeneralKnowledge.leetCode;

public class TwoSum {
    int[] array= new int[3];

    public TwoSum(int[] array){
        this.array=array;
    }
    public static void twoSum(int[] nums, int target){
        for (int i=0; i< nums.length;i++){
            for (int j=i+1; j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    int [] array2={i,j};
                    System.out.print(array2+" ");
                }
            }
        }
        System.out.println("Could not find two-sum");
    }

}
