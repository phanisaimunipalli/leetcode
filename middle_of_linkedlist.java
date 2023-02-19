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
    public ListNode middleNode(ListNode head) {
        // slow and fast pointers
        // fast = twice of slow
        // slow = head.next
        // fast = head.next.next
        // so by the time fast = head.next.next is null that means it reached end
        // slow will be at middle by that time.

        //Eg: 1 2 3 4 5
        // Trace 1
        //  1   2   3   4   5
        //  s       f
        // ---------
        // Trace 2
        //  1   2   3   4   5
        //      s       f
        // ---------
        // Trace 4
        //  1   2   3   4   5
        //          s       f
        // ---------
        // Trace 5 -- here fast.next == null (so we reached end, return slow node)
        //  1   2   3   4   5
        //          s       f

        // basic checks for LinkedList nodes
        if(head == null) return null;
        if(head.next == null) return head;

        // initialize 2 pointers
        ListNode slow = head;
        ListNode fast = head;

        //iterate until fast(head.next) is not null (reach the end)
        while(fast != null && fast.next != null){
            slow = slow.next;   // move one node
            fast = fast.next.next;  // move twice the slow pointer
        }  
        return slow;
        

    }
}
