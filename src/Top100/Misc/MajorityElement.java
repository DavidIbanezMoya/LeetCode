package Top100.Misc;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/
public class MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> quantity = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!quantity.containsKey(nums[i])) {
                quantity.put(nums[i],1);
            }
            else {
                //Increasing the number of times that it appears
                quantity.replace(nums[i], quantity.get(nums[i])+1);
            }
        }

        //Check the highest number on the list
        System.out.println(quantity);
        //Converting the hashmap to a collection and looking for the maximum value of all the keys
        return Collections.max(quantity.entrySet(),Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }
}
