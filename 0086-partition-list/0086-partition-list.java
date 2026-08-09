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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode l1 = dummy1;
        ListNode l2 = dummy2;
        ListNode t = head;
        
        while(t != null){
            
            if(t.val < x){
                l1.next = t;
                l1 = l1.next;
            }
            else{
                l2.next = t;
                l2 = l2.next;
            }
            t = t.next;
        }
        
        l1.next = dummy2.next;
        l2.next = null;

        return dummy1.next;
    }
}