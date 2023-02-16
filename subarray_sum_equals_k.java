class Solution {
    public int subarraySum(int[] nums, int k) {
       // Step 1: Consider hashmap to find subarray
       // Step 2: Iterate through array nums and sum each element as we go 
       // Step 3: put into the map (sum, occurances)
       // Step 4: now in between step 2 and step 3, check if map alread has the key of (sum - k)
        // if present ==> then increment the counter by getting map.get(sum-k)
       // in the end return the counter

       int sum = 0;
       int count = 0;
       HashMap<Integer, Integer> map = new HashMap<>();
       map.put(0, 1);   //  to track initial sum, occurence ==> (0, 1)
       for(int i = 0; i < nums.length; i++){
           sum += nums[i];  // calculate sum of each element as we go
           if(map.containsKey(sum - k)){
               count += map.get(sum - k);
           }
           // put the sum into map and if its already present, increment the counter
           map.put(sum, map.getOrDefault(sum, 0) + 1);
       }

       return count;
    

    }
}
