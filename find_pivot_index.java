class Solution {
    public int pivotIndex(int[] nums) {
        // Step 1: Calculate totalSum by iterating one time
        // Step 2: track leftSum only and we can derive rightSum
        // Step 3: Iterate second time and whenever leftSum == rightSum return i
            // else: do the leftSum ==> leftSum += nums[i] 
        // IMP: rightSum can be calculated using ==> rightSum = totalSum - leftSum - nums[i]

        int totalSum = 0;
        int leftSum = 0;
        for(int n : nums){
            totalSum += n;
        }

        for(int i = 0; i < nums.length - 1; i++){
            if(leftSum == totalSum - leftSum - nums[i]){ // (leftSum == rightSum)
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
