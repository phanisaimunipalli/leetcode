class Solution {
    public int[] sortedSquares(int[] nums) {

        //initialize 2 pointers 
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];

        //-4    -1  0   3   10 (Math.abs --> ignores the signs)
        // 4    1   0   3   10
        // l                r

        for(int i = nums.length - 1; i >= 0; i--){  // start from reverse to fill result array
            int square; //consider a new int every iteration
            if(Math.abs(nums[left]) < Math.abs(nums[right])){   
                // if(4 < 10) => this means 10 can be untouched and move right-- (next before)
                square = nums[right];
                right--;
            }else{
                //  if(4 not less than 3) ==> then left++ (left has to be moved)
                square = nums[left];
                left++;
            }
            //square current num to assign it into result array
            square = square * square;

            // [0, 0, 0, 0, 100] --> Trace 1
            // [0, 0, 0, 16, 100] --> Trace 2
            // [0, 0, 9, 16, 100] --> Trace 3
            res[i] = square;
        }
        return res;
        
    }
}
