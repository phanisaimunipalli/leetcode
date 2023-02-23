/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Step 1: Hare and Tortoise (fast and slow) ptrs 
            // traverse until fast != null and fast.next != null 
            // slow = slow.next 
            // fast = fast.next.next
            // if slow == fast in same while then consider this slow ptr as an "Intersection"
        // Step 2: check for intersection node is null or not, if null, just return it
        // Step 3: Start again with two pointers ptr1 (head) and ptr2 (ptr2 is intersect node)
            // while: iterate until ptr1 != ptr2
            // move one node each ==> ptr1 = ptr1.next && ptr2 = ptr2.next
            
        
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode intersect = null;

        // traverse until the fast ptr is null
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // intersection node
            if(fast == slow){
                intersect = slow;
                break;
            }
        }

        // if intersection node is null then return null;
        if(intersect == null) return null;

        // once we find the intersection node, then we need to make two pointrs 
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while(ptr1 != ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}
