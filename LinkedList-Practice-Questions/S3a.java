// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

public class S3a {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {

        Node s = head;
        Node f = head;

        do {

            if (f.next == null || f.next.next == null) {
                return false;
            }

            s = s.next;
            f = f.next.next;

        } while (s != f);

        return true;
    }
}
