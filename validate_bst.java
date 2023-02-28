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
    public boolean isValidBST(TreeNode root) {
        // consider BST ==> low (left) | mid (root) | high (right)
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal){
        if(root == null) return true;
        // if either of these conditions are true then its not a valid BST
        if(minVal >= root.val || maxVal <= root.val) return false;

        // as we got to left -> left -> left ==> (1, minVal, 5)
        // as we got to right -> right -> right ==> (4, 5, maxVal)
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);

    }
}
