package Top100.Hashing;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] numbers;
        //Going over the array to check for the possible sums
        for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    //Check for dont repeat the same number twice
                    if (i!=j) {
                        if (nums[i]+nums[j] == target || nums[i]+nums[j] == -target) {
                            numbers = new int[]{i, j};
                            System.out.println(numbers);
                            return numbers;
                        }
                    }

                }

        }
        return new int[]{};
    }
}
