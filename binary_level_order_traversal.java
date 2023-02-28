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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();
        List<List<Integer>> res = new LinkedList<>();

        // since its level order traversal - BFS
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);  // add the root ele beginning itself
        while(!queue.isEmpty()){
            List<Integer> list = new LinkedList<>();    // to store inner list
            // IMP: save this current Queue Size so that it won't update after adding child elements
            int actualQSize = queue.size();
            for(int i = 0; i < actualQSize; i++){
                TreeNode curr = queue.poll();   // get and remove the first element
                list.add(curr.val); // mark it as visited
                if(curr.left != null){  // then start checking for left child
                    queue.offer(curr.left); // offer ==> add into queue
                }
                if(curr.right != null){ // check right node exists
                    queue.offer(curr.right);    // add the right node to queue
                }
            }
            res.add(list);  // add the innerlist to outer res list

        }
        return res; // finally return the res list
    }
}
