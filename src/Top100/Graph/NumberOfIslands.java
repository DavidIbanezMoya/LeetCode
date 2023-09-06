package Top100.Graph;

public class NumberOfIslands {

    int nIslands = 0;
    public int numIslands(char[][] grid) {
        //We will iterate over each position looking for the ones who are land

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                //Check if its land or water

                //If its land, check the following directions +1
                if (grid[i][j] == '1'){

                    //Reached an island we will check it and then count it
                    checkIsland(grid,i,j);
                    nIslands++;
                }
            }
        }


        return nIslands;
    }

    public void checkIsland (char[][] grid, int i, int j) {

        //Need to keep this order in the if
        if ( i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        //Set it to 0 because we will moving the position
        //We will also turn the land into to water to dont count the island more times
        grid[i][j] = '0';

        //Looking for land on the other directions
            checkIsland(grid,i,j+1);
            checkIsland(grid,i+1,j);
            checkIsland(grid,i,j-1);
            checkIsland(grid,i-1,j);

    };
}
