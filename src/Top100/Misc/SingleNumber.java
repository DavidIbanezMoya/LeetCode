package Top100.Misc;

import java.util.ArrayList;
import java.util.Collections;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        ArrayList<Integer> emptyNumber = new ArrayList<>();
        //Adding every number to an ArrayList
        for (int i = 0; i < nums.length; i++) {
            emptyNumber.add(nums[i]);
            int count = 0;
            for (int j = 0; j < emptyNumber.size(); j++) {
                if (emptyNumber.get(j) == nums[i]) {
                    count++;
                }

                //If the number is repeated we will delete all of those
                if (count > 1){
                    emptyNumber.removeAll(Collections.singleton(Integer.valueOf(emptyNumber.get(j))));
                }
            }
        }
        return emptyNumber.get(0);
    }
}
