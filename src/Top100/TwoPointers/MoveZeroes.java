package Top100.TwoPointers;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        //We will use the bubble method to move the 0 to the end
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                //Detecting if the following number is a 0
                if (nums[j+1] != 0 && nums[j] == 0) {
                    int auxiliar = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = auxiliar;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
