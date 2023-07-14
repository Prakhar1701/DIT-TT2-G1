// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

public class S4 {

    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Solution 2:
    // Expected Time Complexity: O(N)
    // Expected Auxiliary Space: O(1)

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1, head);

        ListNode f = dummy;
        ListNode s = dummy;

        for (int i = 0; i < n; i++) {
            f = f.next;
        }

        while (f.next != null) {
            s = s.next;
            f = f.next;
        }

        s.next = s.next.next;

        // return head; // Unable to handle edge case :(
        return dummy.next;
    }

    // Solution 1:
    // Expected Time Complexity: O(2N)
    // Expected Auxiliary Space: O(1)

    // public ListNode removeNthFromEnd(ListNode head, int n) {

    // int l = 0;

    // ListNode t = head;

    // while (t != null) {
    // l++;
    // t = t.next;
    // }

    // if (l == n) { // edge case
    // head = head.next;
    // return head;
    // }

    // t = head;

    // for (int i = 0; i < l - n - 1; i++) {
    // t = t.next;
    // }

    // t.next = t.next.next;

    // return head;
    // }
}
