class Solution {
    public int[] twoSum(int[] nums, int target) {
        //tracking the indices which result has sum of nums in the array
        //Clarify whether the pair of indices are to be adjacent(i, i+1) or anywhere in the array
        //so if it comes to tracking, Map DS is best
        //Eg: nums: 2 7 11 5
        // target = 9
        // Map<nums[i], currIndex>
       HashMap<Integer, Integer> map = new HashMap<>();

       //go through each elem in nums array
       for(int i = 0; i < nums.length; i++){
           int diff = target - nums[i]; // find the remainder => 9-2 = 7
           // if 7 (diff) is found in the map key (nums[i]), 
           // (map.contains(7) => then 7 is also nums[i] is an elem of array)
            //  then the 2 (which got subtracted (nums[i])) adds up to target 
           if(map.containsKey(diff)){
               return new int[]{map.get(diff), i};
           }
           // if diff is not found, then just put it in map along with the current i
           map.put(nums[i], i);
       }
       return new int[0];
    }
}
