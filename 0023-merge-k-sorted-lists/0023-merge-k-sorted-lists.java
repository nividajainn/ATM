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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        // step 1: sab lists ke first nodes daalo
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // step 2: smallest node nikaalte raho
        while (!pq.isEmpty()) {

            ListNode minNode = pq.poll();
            curr.next = minNode;
            curr = curr.next;

            // next node bhi daal do heap me
            if (minNode.next != null) {
                pq.offer(minNode.next);
            }
        }

        return dummy.next;
    }
}