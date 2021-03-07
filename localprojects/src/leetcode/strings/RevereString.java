package leetcode.strings;

/*

Swap the characters

 */
public class RevereString {

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }

    private static void reverseString(char[] chars) {
        int i=0;
        int j=chars.length-1;
        while(i < j){
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
        System.out.println(String.valueOf(chars));
    }
}
