// https://leetcode.com/problems/add-two-numbers/description/

public class S9 {

    // Definition for singly-linked list.
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

    // Input: l1 = [2,4,3], l2 = [5,6,4]
    // Output: [7,0,8]
    // Explanation: 342 + 465 = 807.

    class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode t1 = l1;
            ListNode t2 = l2;

            int ll1 = 0, ll2 = 0;

            while (t1 != null) {
                ll1++;
                t1 = t1.next;
            }

            while (t2 != null) {
                ll2++;
                t2 = t2.next;
            }

            if (ll1 < ll2) {
                ListNode t = l2;
                l2 = l1;
                l1 = t;
            }

            t1 = l1;
            t2 = l2;

            int c = 0;

            while (t1 != null) {

                int b = 0;
                if (t2 != null) {

                    b = t2.val;
                    t2 = t2.next;

                }

                t1.val += b + c;

                if ((t1.val / 10) != 0) {
                    c = 1;
                } else {
                    c = 0;
                }

                t1.val = t1.val % 10;

                t1 = t1.next;

            }

            if (c == 1) {

                t1 = l1;

                while (t1.next != null) {
                    t1 = t1.next;
                }

                t1.next = new ListNode(1, null);
            }

            return l1;
        }
    }

}
