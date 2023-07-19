// https://leetcode.com/problems/middle-of-the-linked-list/description/

public class S1 {

    public class ListNode {
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

    // Self:
    class Solution {
        public ListNode middleNode(ListNode head) {

            int length = 0;

            ListNode temp = head;

            while (temp != null) {
                length++;
                temp = temp.next;
            }

            temp = head;

            for (int i = 0; i < length / 2; i++) {
                temp = temp.next;
            }

            return temp;

        }
    }

    // Leetcode Top Submissions:
    // class Solution {
    // public ListNode middleNode(ListNode head) {
    // ListNode slow = head;
    // ListNode fast = head;

    // while(fast != null && fast.next != null)
    // {
    // slow = slow.next;
    // fast = fast.next.next;
    // }

    // return slow;
    // }
    // }
}