class Solution {
    public int climbStairs(int n) {
        // 1. 1 + 1 + 1 + 1
        // 2. 1 + 1 + 2
        // 3. 2 + 2
        // 4. 2 + 1 + 1
        // 5. 1 + 2 + 1 
        // Eg: 1   2   3   4   5

        // Time: O(N) | Space: O(1) with Fibonacci

        if(n == 1) return n;
        int first = 1;
        int second = 2;
        for(int i = 3; i <= n; i++){
            int third = first + second; // similar to fibonocci, we have to find sum of f + s
            first = second; // to get the i - 1 and i - 2 values we are swapping with updated values
            second = third;
        }
        return second;
    }
}
