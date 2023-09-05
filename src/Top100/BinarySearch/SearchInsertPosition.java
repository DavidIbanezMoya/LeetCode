package Top100.BinarySearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            //Check other constraints to dont collide beetwen them
            if (nums[i] == target) return i;
            else if (nums[i] > target) {
                return i;
            }
            else if (nums[i] < target && i+1 == nums.length ) {
                return i+1;
            }
        }
        return 0;
    }
}
