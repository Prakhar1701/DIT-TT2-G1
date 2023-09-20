// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

public class S3 {

    private static class ListNode {
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

    public static void main(String[] args) {

        int n = 1;

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);




            removeNthFromEnd(head, 1);


        printLinkedList(head);
    }

    public static void printLinkedList(ListNode head) {

        while (head != null) {
            System.out.print(" " + head.val);
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        int l = 0;

        ListNode temp = head;

        while (temp != null) {
            l++;
            temp = temp.next;
        }

        int npfs = l - n + 1;

        // System.out.println(npfs);

        ListNode t1 = head;

        for (int i = 1; i < npfs - 1; i++) {

            t1 = t1.next;
        }

//        System.out.println("=> " + t1.val);

        if (t1.next == null) {
            head = null;
        }
        // System.out.println("=> " + t1.next.val);

        if (head.next == null && n == 1) {
            head = null;
        }else {
            t1.next = t1.next.next;
        }

        return head;
    }

}
