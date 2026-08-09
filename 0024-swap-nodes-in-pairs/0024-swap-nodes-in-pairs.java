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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;

        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = null;

        ListNode l1 = evenHead;
        ListNode l2 = head;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(l1 != null && l2 != null) {

            curr.next = l1;
            curr = curr.next;
            l1 = l1.next;

            curr.next = l2;
            curr = curr.next;
            l2 = l2.next;
        }

        if(l1 != null) {
            curr.next = l1;
        }

        if(l2 != null) {
            curr.next = l2;
        }

        return dummy.next;
    }
}