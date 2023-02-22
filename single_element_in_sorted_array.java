class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Eg: 1,1,2,3,3,4,4,8,8
        // Logic 1: Check for nums[mid] index and 
            // whenever nums[mid + 1] and nums[mid - 1] are both different that's our target
            // because rest of the values will have atleast one side same value

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low < high){
            mid = low + (high - low) / 2;
            // Logic 2: 
            // if mid is even and mid + 1 has same value == true
            // if mid is odd and mid - 1 has same value = true
            // then unique value will be on right side 
            if((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])){
                low = mid + 1;
            }else { 
                // if any of the above values are false, then that means our uniq value is on left side
                high = mid;
            }
        }
        // by the end whatever is remaining in low --> is our unique value
        return nums[low];
    }
}
