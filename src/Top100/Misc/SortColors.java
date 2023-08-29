package Top100.Misc;

/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.*/

//Red 0 White 1 Blue 2
public class SortColors {
    public void sortColors(int[] nums) {

        //To solve this problem we will use bubble sorting as we make the colors be numbers
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j] >= nums[j+1]) {
                    int auxiliar = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = auxiliar;
                }
            }
        }
        //Showing each number of the array
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
