package leetcode.strings;

/*

Swap the characters

 */
public class RevereString {

    public static void main(String[] args) {
        reverseString(new char[]{'a','a','b','a','a'});
        System.out.println(palimdrome("aabaa"));
        System.out.println(palidromeMine("az"));
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

    private static boolean palimdrome(String inputString){
        boolean val=false;
        char[] chars= inputString.toCharArray();
        int i=0;
        int j=chars.length-1;
        while(i < j){
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
        if(String.valueOf(chars).equals(inputString))
        {
            val = true;
        }
        return val;
    }

    private static boolean palidromeMine(String inputString){
        boolean val=false;
        char[] inpt = inputString.toCharArray();
        char[] target = new char[inpt.length];
        int j=0;
        for (int i=inpt.length-1;i>=0;i--){
            target[j] = inpt[i];
            j++;
        }
        if (String.valueOf(target).equals(inputString)){
            val = true;
        }

        return val;
    }

    private static boolean palindromeFinal(String inputString){

        int i=0;
        int j= inputString.length()-1;
        while(i< j){
            if (inputString.charAt(i)!=inputString.charAt(j)){

                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
