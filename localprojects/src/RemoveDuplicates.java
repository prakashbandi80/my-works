/*

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

Two pointer approach

 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1,1,2};
        int len = removeDuplicates(nums);
        System.out.println(len);
    }

    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;

        for (int j=1; j<nums.length; j++)
        {
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
