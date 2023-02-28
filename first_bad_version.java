/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // binary search to find that bad version
        // consider this as a sorted array 
        // [1      2     3     4     5]
        //  F      F     F     T     T
        int low = 1;
        int high = n;
        int mid; 
        
        while(low <= high){
            mid = low + (high-low)/2;   // if the mid value becomes higher than actual lenght of array
            // IMP: focus on always mid 
            if(isBadVersion(mid) == false){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }
}
