class Solution {
      public int numIslands(char[][] grid) {
          // find the length of rows and columns
          int rows = grid.length;
          int columns = grid[0].length;

        // initialize a counter to track no of islands
        int numIslands = 0;

        // iterate through entire 2d array
          for(int i = 0; i < rows; i++){
              for(int j = 0; j < columns; j++){
                //   System.out.println(grid[i][j]);
                  if(grid[i][j] == '1'){
                      // an island is found definitely
                      numIslands++;     // so incrementing it and call dfs to continue the sides search
                      dfs(grid, i, j);  
                  }
              }
          }

          return numIslands;
    }

    public void dfs(char[][] grid, int i, int j){
        int rows = grid.length;
        int columns = grid[0].length;

        // check for common conditions to skip the search 
        // important is ==> grid[i][j] == 0 ==> this means 
        // there is no further 1 found to change the case to that area 
        if(i < 0 || i >= rows || j < 0 || j>= columns || grid[i][j] == '0' ){
            return;
        }

        //if 0 is not found above, that means we found 1 ==> 
            // it has to be marked as visited by updating it as "0".
        grid[i][j] = '0';
        // we found 1 again so let's call dfs to search 4 sides (i-1, i+1, j-1, j+1)
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);


    }
}
