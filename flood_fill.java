class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // get rows and columns length
        int rows = image.length;
        int columns = image[0].length;
        int startPixel = image[sr][sc];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i == sr && j == sc){ 
                    // whenever i and j are equal to sr and sc --> then only consider filling
                    dfs(image, i, j, color, startPixel);
                }
            }
        }
        return image;
    }

    public void dfs(int[][] image, int i, int j, int color, int startPixel){
        int rows = image.length;
        int columns = image[0].length;
        // condition break: when the recursion has to be broken/skipped.
        // image[i][j] == color --> important | because we don't need to touch the color already filled
        // image[i][j] != startPixel --> if the value is not startPixel then no need to execute
        if(i < 0 || i >= rows || j <0 || j>= columns || image[i][j] != startPixel ||image[i][j] == color){
            return;
        }
        
        // if the value is startPixel then only the flood has to be filled.
        if(image[i][j] == startPixel){
            // memoization ==> mark the visited pixel (in this problem ==> fill it with color)
            image[i][j] = color;
            // check 4-directionally
            dfs(image, i-1, j, color, startPixel);  
            dfs(image, i+1, j, color, startPixel);
            dfs(image, i, j-1, color, startPixel);
            dfs(image, i, j+1, color, startPixel);
        }

    }
}
