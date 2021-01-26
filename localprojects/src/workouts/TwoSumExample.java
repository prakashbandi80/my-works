package workouts;

import java.util.HashMap;
import java.util.Map;

public class TwoSumExample {

    public static void main(String[] args) {

        int[] numbers = {2,3,4,7,8};
        int target = 7;
        int[] result = twoSum(numbers,target);
         System.out.println(result[0]+","+result[1]);
    }

    public static int[] twoSum(int[] numbers, int target){

        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int delta = target - numbers[i];
            if(visitedNumber.containsKey(delta)){
                return new int[] {i, visitedNumber.get(delta)};
            }
            visitedNumber.put(numbers[i], i);
        }
        return new int[] {-1, -1};
    }
}
