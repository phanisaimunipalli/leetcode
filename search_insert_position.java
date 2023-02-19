class Solution {
    public int searchInsert(int[] nums, int target) {
        // use binary search for O(log n) time
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low <= high){
            mid = low + (high - low)/2;
            if(nums[mid] == target) return mid; // return index if it matches
            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }
        }
        // IMP: we have to return the index where it will be inserted and not actual mid
        return low;
    }
}
