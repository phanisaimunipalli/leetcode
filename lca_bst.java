/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // LCA is nothing but finding the middle value between p and q and return it
        // p and q values are less than root that means LCA node is at LEFT of the Tree
        if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);

        // p and q values are greater than root that means LCA node is at RIGHT of the Tree
        if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);

        // if either of less than or greater than is not true that means we are looking at node itself
        // Eg: p = 2 and q = 4 ==> LCA Node: 2 
        return root;
    }
}
