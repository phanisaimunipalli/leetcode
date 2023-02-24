/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        // recursive approach is easy and runtime is very less
        if(root == null || root.children == null) return new LinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<>();
        traverse(root, list);
        return list;
    }

    // recursive method
    public void traverse(Node curr, LinkedList<Integer> list){
        // base case for recursive call
        if(curr == null) return;
        // after crossing base case ==> we need to mark it as visited
        list.add(curr.val);

        // no after we the parent is visited, let's go to children
        for(Node eachNode : curr.children){
            traverse(eachNode, list);
        }
    }
}


        // Iterative Approach but time and space complexity is very high
        // Stack<Node> stack = new Stack<>();
        // stack.push(root);
        // while(!stack.isEmpty()){
        //     // pop the stack and assign to currNode
        //     Node curr = stack.pop();

        //     //consider it as visited after pop
        //     list.add(curr.val);

        //     List<Node> currChildren = new LinkedList<>(curr.children);

        //     for(int i = currChildren.size() - 1; i >= 0; i--){
        //         stack.push(currChildren.get(i));
        //     }

        // }
