/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int target) {
        // initialize a bossnode to track the pointers as the questions is about remove/delete element
        ListNode bossNode = new ListNode(0);
        bossNode.next = head;   // link the new bossNode with current head to have full link (train)

        ListNode prev = bossNode;   //  if the first curr.val itself matches with target, then we need to link with prev
        ListNode curr = head;  

        // go until end of the elements
        while(curr != null){
            // if curr.val is matched with target
            if(curr.val == target){
                prev.next = curr.next;  // IMP: we need to link prev node with curr.next node (deletes middle node)
            }else{
                prev = prev.next;   // else move prev pointer to next because as we didn't find target
            }
            
            // move curr pointer to next
            curr = curr.next;
        }
        
        // need to return next of bossNode as those are the actual elements
        return bossNode.next;


    }
}
