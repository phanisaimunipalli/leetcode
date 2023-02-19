class Solution {
    public void rotate(int[] nums, int k) {
        //Eg: 1   2   3   4   5   6   7     // 0....k-1|k....nums.length-1
        //  Step 1: Reverse all numbers
            //  7   6   5   4   3   2   1
        //  Step 2: Reverse (0 to k-1) elements
            //  since k = 3 | reverse until 0 to k-1 => (0, 1, 2)
            //  5   6   7   4   3   2   1
        // Step 3: Now reverse (k to nums.length)
            //  5   6   7   1   2   3   4 --> result

        k %= nums.length;  // Eg: [-1], k = 2 ==> if k > nums.length, modulus will handle 2)1(0 
        reverse(nums, 0, nums.length-1);    // Step 1
        reverse(nums, 0, k-1);              //  Step 2
        reverse(nums, k, nums.length-1);    //  Step 3
    }

    public void reverse(int[] nums, int start, int end){
            while(start < end){
                int temp = nums[start];
                nums[start++] = nums[end];
                nums[end--] = temp;
            }
        }
}
