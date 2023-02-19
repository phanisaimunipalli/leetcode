class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean isCol = false;

        for(int i = 0; i < rows; i++){
            // we are considering first row and starting from second column
            // so we need to remember and cover the first column later
            // hence we are saving it in extra variable ==> if any of first cell in each row
            if(matrix[i][0] == 0){
                isCol = true;
            }

            for(int j = 1; j < columns; j++){
                // if the curr index is found 0 
                // then mark that first index(i, j) of row and column as 0
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;   // first row
                    matrix[i][0] = 0;   // first column
                }
                // System.out.print(matrix[i][j] + "   ");
            }
            // System.out.println();
        }

        // System.out.println("---------------------");
        // now based on the markings of first row and column we did, 
        // we can traverse again to make values as zeroes wherever we find first row or column as 0
        // matrix[0][j] ==> first row | matrix[i][0] ==> first column
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < columns; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
                // System.out.print(matrix[i][j] + "   ");
            }
            // System.out.println();
        }

        // check if the first row needs to be set to zero because of (i, j) = (0, 0) => 0
        if(matrix[0][0] == 0){
            for(int j = 0; j < columns; j++){
                matrix[0][j] = 0;   // first cell in each column
            }
        }

        // in similar way check for the first column by using out extra var ==> isCol
        if(isCol){
            for(int i = 0; i  < rows; i++){
                matrix[i][0] = 0;   // first cell in each row
            }
        }
    }
}
