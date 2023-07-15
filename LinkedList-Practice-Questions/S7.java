// https://leetcode.com/problems/intersection-of-two-linked-lists/description/

public class S7 {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution2 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            if (headA == null || headB == null)
                return null;

            ListNode a = headA;
            ListNode b = headB;

            while (a != b) {
                // variable = condition ? value1 : value2;
                a = (a == null) ? headB : a.next;
                b = (b == null) ? headA : b.next;
            }

            return a;

        }
    }

    public class Solution1 {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            int lA = 0;
            int lB = 0;

            ListNode t = headA;

            while (t != null) {
                lA++;
                t = t.next;
            }

            t = headB;

            while (t != null) {
                lB++;
                t = t.next;
            }

            int diff = Math.abs(lA - lB);

            ListNode hA = headA;
            ListNode hB = headB;

            if (lA > lB) {
                for (int i = 0; i < diff; i++) {
                    hA = hA.next;
                }
            } else {
                for (int i = 0; i < diff; i++) {
                    hB = hB.next;
                }
            }

            while (hA != hB) {
                hA = hA.next;
                hB = hB.next;
            }

            return hA;
        }
    }

}