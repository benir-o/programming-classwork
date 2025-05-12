import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    int[] array;

    public TwoSum(int[] array){
        this.array=array;
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);


        }
        return nums;
    }
    @Override
    public String toString(){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]+" ");
        }
        return "Array elements displayed";
    }
}
