class Solution {
    public void moveZeroes(int[] nums) {
        // 0   1   0   3   12
        // i
        // uniq


        int uniqIndex = 0;  // uniqIndex is for tracking unique values 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[uniqIndex++] = nums[i]; //  insert at uniqIndex and increment it later for next
            }
        }

        // 1    3   12      3    12
        //          uniq -> 0     0

        // now start from the uniqIndex which means the remaining places in array are filled with zeroes
        for(int i = uniqIndex; i < nums.length; i++){
            nums[i] = 0;    // start from uniqIndex and fill 0s to the end of array
        }
    }
}
