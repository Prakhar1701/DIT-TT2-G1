//  https://leetcode.com/problems/palindrome-linked-list/description/

public class S6 {

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

    class Solution {

        public boolean isPalindrome(ListNode head) {

            ListNode s = head, f = head, p, n;

            while (f != null && f.next != null) {
                s = s.next;
                f = f.next.next;
            }

            p = s;
            s = s.next;
            p.next = null;

            while (s != null) {
                n = s.next;
                s.next = p;
                p = s;
                s = n;
            }

            f = head;
            s = p;

            while (s != null) {
                if (f.val != s.val)
                    return false;
                f = f.next;
                s = s.next;
            }

            return true;
        }
    }

    // class Solution {

    // public boolean isPalindrome(ListNode head) {

    // int length = 0;

    // ListNode t = head;

    // while (t != null) {
    // length++;
    // t = t.next;
    // }

    // int m = ((length & 1) == 0) ? (length / 2) : (length / 2) + 1;

    // ListNode dummy = new ListNode(-1, head);

    // ListNode p = dummy;

    // for (int i = 0; i < m; i++) {
    // p = p.next;
    // }

    // ListNode c = p.next;
    // ListNode n = p.next;

    // while (c != null) {
    // n = n.next;
    // c.next = p;
    // p = c;
    // c = n;
    // }

    // ListNode t1 = head;
    // ListNode t2 = p;

    // for (int i = 0; i < m; i++) {
    // if (t1.val != t2.val) {
    // return false;
    // }
    // t1 = t1.next;
    // t2 = t2.next;
    // }

    // return true;
    // }
    // }

}