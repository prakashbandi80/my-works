package leetcode.strings;

/*

Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

 */
public class ShuffleString {


    public static void main(String[] args) {

        int[] indices = new int[]{4,5,6,7,0,2,1,3};
        String s = restoreString("codeleet", indices);
        System.out.println(s);

    }

    private static String restoreString(String input, int[] indices) {

        char[] restoreString = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            restoreString[indices[i]] = input.charAt(i);
        }
        return String.valueOf(restoreString);
    }
}
