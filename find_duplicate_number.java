class Solution {
    public int findDuplicate(int[] nums) {
       // We can't use Hashset here since the problem asked for only constant extra space
       // Eg: 3​    3   5   4   1   3 
        //    0    1   2   3   4   5 (index)
       // T1 ==> nums[0] = 3 | nums[nums[0]] = nums[3] = 4
            //  (3 != 4) ==> so swap both using temp var called next
            // 4​   3   5   3   1   3 
        //    0    1   2   3   4   5 (index)
       // T2 ==> nums[0] = 4 | nums[nums[0]] = nums[4] = 1
            //  (4 != 1) ==> so swap both using temp var called next

        // by the end there will occur a point where nums[0] == nums[nums[0]] ==> both values matches
       while(nums[0] != nums[nums[0]]){
           // swap both
           int next = nums[nums[0]];
           nums[nums[0]] = nums[0];
           nums[0] = next;
       }

       return nums[0];  // by the end of while loop there would be a duplicate definitely
        
    }
}
