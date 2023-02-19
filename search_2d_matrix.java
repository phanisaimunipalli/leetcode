class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Step 1: Iterate through 2D array and take all elements into a Single Array
            // because its in sorting order, we can perform Binary Search
        // Step 2: Once the new array is loaded, now do Binary Search

        int rows = matrix.length;
        int columns = matrix[0].length;

        // initialize array upto length of m * n 
        int[] nums = new int[rows * columns];
        int newIndex = 0;   // to track index for new array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                nums[newIndex++] = matrix[i][j];    
                // nums[newIndex++] ==> this will auto increment for next iteration
            }
        }

        // Step 2: Binary Search
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(target == nums[mid]) return true;
            if(target < nums[mid]){
                high = mid - 1; // shift the high before mid since target is lesser than mid
            }else if(target > nums[mid]){
                low = mid + 1;  // shift the low after mid since target is greater than mid
            }
        }
        return false;
    }
}
