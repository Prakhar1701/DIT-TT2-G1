// https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1

public class S10 {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    class circular_LinkedList {
        Node head, head1, head2;
        // Already Implemented by GFG
    }

    class gfg {
        // Function to split a circular LinkedList
        void splitList(circular_LinkedList list) {

            // DO NOT REMOVE THESE 3 LINES
            Node head = list.head;
            Node head1 = null;
            Node head2 = null;

            /*
             * Modify these head1 and head2 here,
             * head is the starting point of our
             * original linked list.
             */

            Node f = head;
            Node s = head;

            while (f.next != head) {

                f = f.next;

                if (f.next == head) {
                    break;
                }

                f = f.next;
                s = s.next;
            }

            head1 = head;
            head2 = s.next;
            s.next = head1;
            f.next = head2;

            // DO NOT REMOVE THESE 2 LINES
            list.head1 = head1;
            list.head2 = head2;
        }
    }
}
