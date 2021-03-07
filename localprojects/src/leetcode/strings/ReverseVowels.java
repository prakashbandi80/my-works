package leetcode.strings;

/*

Write a function that takes a string as input and reverse only the vowels of a string.

Input: "hello"
Output: "holle"


 */

public class ReverseVowels {

    public static void main(String[] args) {

        String input = "hello";
     String s = reverseVowels(input);
    }

    private static String reverseVowels(String input) {

        int start = 0;
        int end = input.length()-1;
        char[] sChars = input.toCharArray();
        while(start < end){
            if(isVowel(sChars[start]) && isVowel(sChars[end])){
                char temp = sChars[start];
                sChars[start++] = sChars[end];
                sChars[end--] = temp;
            } else if(!isVowel(sChars[start]))
                start++;
            else if(!isVowel(sChars[end]))
                end--;
        }
        return String.valueOf(sChars);
    }

    public static boolean isVowel(char vowel){
        if (vowel =='a' || vowel =='e' || vowel =='i' || vowel =='o' || vowel =='u' || vowel =='A' || vowel =='E' || vowel =='I' || vowel =='O' || vowel =='U' ){
            return true;
        }
        return false;
    }
}
