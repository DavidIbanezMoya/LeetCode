package Top100.DynamicProgramming;

public class ClimbingStairs {

    public int climbStairs(int n) {

        //If there are no more than 2 stairs
        if (n <= 2) {
            return n;
        }

        //2 first positions will always be the same
        int[] positions = new int[n+1];
        positions[1] = 1;
        positions[2] = 2;

        //Return the following ones
        for (int i = 3; i <= n; i++) {
            positions[i] = positions[i-1] + positions[i-2];
        }


        return positions[n];
    };
}
