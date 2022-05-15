package slidingwindow;

import java.util.HashMap;
import java.util.Map;

class NoRepeatSubstring {
    public static int findLength(String str) {
        // TODO: Write your code here
        int maxLength = 0, windowStart = 0;

        Map<Character, Integer> mapCharSequence = new HashMap<>();
        for(int windowEnd=0;windowEnd < str.length();windowEnd++){

            char rightChar = str.charAt(windowEnd);
            if(mapCharSequence.containsKey(rightChar)){
                windowStart = Math.max(windowStart, mapCharSequence.get(rightChar)+1);
            }
            mapCharSequence.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("aabccbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abbbb"));
        System.out.println("Length of the longest substring: " + NoRepeatSubstring.findLength("abccde"));
    }
}
