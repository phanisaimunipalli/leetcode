/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        // let's consider pre-order ==> Ro, Lef, Ri

        // Step 1: Consider and stack and push root into stack
        // Step 2: iterate until stack is empty
        // Step 3: CurrNode becomes root as we pop the root from stack
        // Step 4: if condition ==> curr.right IS NOT NULL ==> push curr.right
        // Step 5: if condition ==> curr.left IS NOT NULL ==> push curr.left

        // * Note for Post-Order -- step 4 and 5 wil be reverse


        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);   // push initially since its pre-order

        int sum = 0;

        while(!stack.isEmpty()){

            TreeNode curr = stack.pop();
            // add visited node 
            if(curr.val >= low && curr.val <= high){
                sum += curr.val;
            }

            if(curr.right != null){     // curr.right ==> 10.right = 15
                stack.push(curr.right);
            }

            if(curr.left != null){  // curr.left ==> 10.left = 5
                stack.push(curr.left);
            }
        }
        return sum;
    }
}
