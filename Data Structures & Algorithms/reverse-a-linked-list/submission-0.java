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
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        ListNode next = head.next;
        curr.next = null;

        while (next != null) {
            ListNode temp = curr;
            curr = next;
            next = curr.next;
            curr.next = temp;
        }

        return curr;
    }
}
