package Top100.Greedy;

/*You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.*/
public class JumpGame {
    public boolean canJump(int[] nums) {

        //We have to look at the first position of the array

        //Maximum jump length
        int jump = nums[0];
        int position = 0;

        //Looking for the possible cases
        while (true) {
            int nextMaxJump = 0;
            int nextPosition = -1;

            //In case the jump is either 0 or 1
            if (jump == 0 && position < nums.length-1) return false;
            else if (jump == 0 && position >= nums.length-1) return true;

            if (jump == 1) {
                if (position >= nums.length-1) return true;
                nextMaxJump = nums[position+1];
                nextPosition = position+1;
            }

            for (int i = 1; i < jump+1; i++) {
                //Check if we can reach the goal
                if (nums.length-1 <= jump+position) {
                    return true;
                }

                //Check how to jump properly
                if (nums[position+i]+(i-1) >= nextMaxJump+(i-nextPosition-1) && (nums[position+i] != 0)) {
                    //We have to check with the distance and the number
                    nextMaxJump = nums[position+i];
                    nextPosition = position+i;
                }
            }
            //Out of the for loop
            jump = nextMaxJump;
            position = nextPosition;
        }
    };
}


/*    public boolean canJump(int[] nums) {

        //We have to look at the first position of the array

        //Maximum jump length
        int jump = nums[0];
        int position = 0;

        //Looking for the possible cases
        while (true) {
            int nextMaxJump = 0;
            int nextPosition = 0;

            //In case the jump is either 0 or 1
            if (jump == 0 && position < nums.length-1) return false;
            else if (jump == 0 && position >= nums.length-1) return true;

            if (jump == 1) {
                if (position >= nums.length-1) return true;
                nextMaxJump = nums[position+1];
                nextPosition = position+1;
            }

            for (int i = 1; i < jump+1; i++) {
                //Check if we can reach the goal
                if (nums.length-1 <= jump+position) {
                    return true;
                }

                //Check how to jump properly
                if (nums[position+i]+(i-1) >= nextMaxJump+(nextPosition) && (nums[position+i] != 0)) {

                    //We have to check with the distance and the number
                    nextMaxJump = nums[position+i];
                    nextPosition = position+i;
                }
            }
            //Out of the for loop
            jump = nextMaxJump;
            position = nextPosition;
        }
    };*/