class Solution {
    public int countBattleships(char[][] board) {
        // its a max number of islands problems

        // get the rows and columsn and length
        int rows = board.length;
        int columns = board[0].length;
        int counter = 0;    // track result counter

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                // whenever we find a battleship
                if(board[i][j] == 'X'){
                    dfs(board, i, j); //pass the coordinates
                    counter++;
                }
            }
        }

        return counter;
    }

    public void dfs(char[][] board, int i, int j){
        int rows = board.length;
        int columns = board[0].length;

        // base case 
        // if i < 0 || i >= rows length we can't proceed
        // if j < 0 || j >= columns length we can't
        // IMP: if(board[i][j] == '.') 
        //  if it's already '.' then we can return
        if(i < 0 || i >=rows || j < 0 || j >= columns || board[i][j] == '.'){
            return;
        }

        // marking as visited to avoid infinite loop
        board[i][j] = '.';

        // problem mentioned that atleast one horizontal or vertical cell separates battleship
        // now look for adjacent next row
        dfs(board, i+1, j);
        // and look for adjacent next column
        dfs(board, i, j+1);
        
        
    }
}
