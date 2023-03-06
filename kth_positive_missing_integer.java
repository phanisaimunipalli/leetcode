class Solution {
    public int findKthPositive(int[] arr, int k) {
        // Step 1: O(log(n)) binary search - because of sorted order - O(1)
        // Step 2: Iterate all elements and find ==> arr[mid] - (mid + 1)
            // if the difference between arr[mid] - (mid + 1) is less than given k
                // that means, we found the so far missing numbers till that value and increase low=mid+1
                // Eg:  2    3   4   7   11
                //      0    1   2   3   4    ==> arr[mid] - (mid + 1) = 4 - (2+1) = 4 - 3 = 1
            // else if the value crosses the given k that means we have to decrease high = mid - 1
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(arr[mid] - (mid + 1) < k){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low + k;
    }
}
