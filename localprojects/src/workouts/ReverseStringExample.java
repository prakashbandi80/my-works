package workouts;

public class ReverseStringExample {

    //Reverse a String using the existing StringBuilder api called reverse

    public static void main(String[] args) {

        String str = "Hello!!";

        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println(stringBuilder.reverse().toString());

        reverseManually(str);
    }

    private static void reverseManually(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }

    }


}
