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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>();

        List<List<Integer>> resList = new ArrayList<>();

        // maintain a toggle isReverse Flag for the ZigZag way of adding elements to list
        boolean isReverse = true;  

        // add the root initially itself to iterate through the queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            // whenever queue is not empty ==> means we have some level elements to fetch
            List<Integer> innerList = new ArrayList<>();
            int qSize = queue.size();

            // since queue is not empty, we need to get the NODES inside by iterating through queue
            for(int i = 0; i < qSize; i++){
                TreeNode curr = queue.poll();   // get the first node
                if(curr.left != null) queue.offer(curr.left); // add the left node to queue
                if(curr.right != null) queue.offer(curr.right);    // add the right node to queue
                // finally add the curr.val to innerlist
                innerList.add(curr.val);
            }

            if(!isReverse){
                Collections.reverse(innerList);
            }
            resList.add(innerList);

            // toggle isReverse Flag
            isReverse = !isReverse;

        }
     return resList;   
    }
}
