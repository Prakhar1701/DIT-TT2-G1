// https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1

public class S14 {

    // Node class used in the program:

    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

    /*
     * Function which returns the root of
     * the flattened linked list.
     */

    class GfG {

        Node flatten(Node root) {

            if (root == null)
                return null;

            root = merge(root, flatten(root.next));

            return root;
        }

        Node merge(Node h1, Node h2) {

            Node dummy = new Node(-1);

            Node t = dummy;

            Node a = h1;
            Node b = h2;

            while (a != null && b != null) {
                if (a.data <= b.data) {
                    t.bottom = a;
                    t = t.bottom;
                    a = a.bottom;
                } else {
                    t.bottom = b;
                    t = t.bottom;
                    b = b.bottom;
                }
            }

            if (a != null)
                t.bottom = a;
            else if (b != null)
                t.bottom = b;

            Node head = dummy.bottom;

            return head;
        }
    }

}

