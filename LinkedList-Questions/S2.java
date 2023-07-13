public class S2 {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {

            slow = slow.next;

            fast = fast.next;

            if (fast != null) {
                fast = fast.next;
            } else {
                return false;
            }

            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}