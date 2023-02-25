class Solution {

    public int search(int[] nums, int target) {
        //   need 3 pointers - start, mid, end and use always while
        //  Total 3 cases
            //Case 1: if nums[mid] == target ==> return mid (index)
            //Case 2: if nums[mid] < target ==> (3 < 9) ==> we have to increase "start" to reach "mid+1"
            //Case 3: if nums[mid] > target ==> (10 > 9) ==> we have to decrease "end" to reach "mid-1"

        // -1   0   3   5   9   12  | target = 9
        //  s       m           e

        // -1   0   3   5   9   12  | target = 9 ==> if (nums[mid] < target) ==> (3 < 9)
        //  s       m           e
        // -1   0   3   5   9   12  | ==> Updated!
        //              s   m    e

        // -1   0   3   5   9   12  | target = 2 ==> if (nums[mid] > target) ==> (3 > 2)
        //  s       m           e
        // -1   0   3   5   9   12   ==> Updated!
        //  s   e
        //      m
        
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end)/2;

        while(start <= end){    // iterate until start meets end
            mid = (start + end)/2;  //  determine mid value first
            if(target == nums[mid]) return mid; //
            if(nums[mid] < target){
                start = mid+1; 
            }else if(nums[mid] > target){
                end = mid - 1;
            }
        }
        
        return -1;
    }
}
