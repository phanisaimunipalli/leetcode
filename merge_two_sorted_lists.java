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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // if either of the two lists is null then remaining can be returned
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val){
            // continue with next link by passing it again same in place of list1
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            // in case of >= do the same by passing in place of list2
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

       
    }
}
