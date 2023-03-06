class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Step 1: Bottom-up approach ==> update the existing array
        // Step 2: Start from index=2 and find the min of i - 1 and i - 2
        // Step 3: Replace cost[i] by adding cost[i] + min(cost[i-1], cost[i-2])
        // Step 4: Once you reach end of the loop, return the min(array.length - 1, array.length - 2)
        for(int i = 2; i < cost.length; i++){
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
