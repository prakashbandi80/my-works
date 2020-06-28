import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] numberArray = {2, 7, 11, 15};
        int target = 9;

        int[] targetArray = twoSum(numberArray, target);
        System.out.println(Arrays.toString(targetArray));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++){
                if (nums[j] == target - nums[i]){
                    return new int[] { i, j };
                }
            }

        }
        throw new IllegalArgumentException("No two sums");
    }
}
