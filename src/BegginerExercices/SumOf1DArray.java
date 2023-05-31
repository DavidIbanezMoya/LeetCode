package BegginerExercices;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumOf1DArray {

    /*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Return the running sum of nums.*/
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        SumOf1DArray sum = new SumOf1DArray();
        int[] result = sum.runningSum(numbers);
        //Just to show the result on the screen
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] runningSum(int[] nums) {
        int number = 0;
        int[] response = new int[nums.length];
        if (nums.length <= 1 || nums.length >= 1000) {
            System.out.println("The array is from 1 to 1000");
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            number = 0;
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    number += nums[j];
                }
            }
            number += nums[i];
            response[i] = number;
        }
        return response;
    }
}
