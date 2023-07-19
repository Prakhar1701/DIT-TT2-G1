// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

public class S3b {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {

        Node s = head;
        Node f = head;
        Node t = s;

        do {

            if (f.next == null || f.next.next == null) {
                return;
            }
            t = s;
            s = s.next;
            f = f.next.next;

        } while (s != f);

        f = head;

        while (s != f) {

            s = s.next;
            f = f.next;
            t = t.next;
        }

        t.next = null;
    }
}
