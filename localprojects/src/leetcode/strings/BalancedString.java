package leetcode.strings;

/*

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it in the maximum amount of balanced strings.

Return the maximum amount of split balanced strings.

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

*/

public class BalancedString {

    public static void main(String[] args) {
        int output = 4;
        int s = balancedString("");
        if (output == s){
            System.out.println("Its a balanced String and expected value");
        }
    }

    private static int balancedString(String s) {

        char[] stringS = s.toCharArray();
        int balance = 0;
        int balanceS = 0;
        int balance1 = 0;
        if(s.length() < 1 || s.length() > 1000)
            return 0;
        for (int i=0;i<s.length();i++){
            if(stringS[i] == 'L')
                balance++;
            else if(stringS[i] == 'R')
                balance1++;
            if (balance == balance1)
                balanceS++;
        }
        return balanceS;
    }
}
