class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Asked - subset in a sorted array - important
        // so we can try using 2-pointers
        // start with left(0) and right(n-1) pointers

        int left = 0;
        int right = numbers.length - 1;

        //as long as both don't meet we have array to iterate
        while(left < right){
            //if the sum of values is equal to target, return a new array of res[0=left, 1=right]
            if(numbers[left]+numbers[right] == target){
                // we are returning left+1, right+1 since pointers started from 0
                return new int[]{left+1, right+1};  
            }
            //if the sum is less than target Eg: 2,3,4,7 | target = 6 -- (2+3 <= 6) ==> true
            else if(numbers[left] + numbers[right] <= target ){
                left += 1;  // then move the left pointer towards right
            }else{
                right -= 1; // else decrease the right pointer towards left
            }
        }
        return new int[]{};
    }
}
