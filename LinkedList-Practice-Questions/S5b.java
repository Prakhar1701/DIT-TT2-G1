// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

//Reverse the Node
public class S5b {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Function to reverse a linked list.
    // Iterative Approch:
    Node reverseList(Node head) {

        Node p = null; // Previous
        Node c = head; // Current
        Node n = head; // Next

        while (c != null) {
            n = n.next;
            c.next = p;
            p = c;
            c = n;
        }

        return p;
    }

    // Recursive Approch:
    // Node reverseList(Node head) {

    // head = reverse(null, head, head);

    // return head;
    // }

    // Node reverse(Node p, Node c, Node n) {
    // if (c != null) {
    // n = n.next;
    // c.next = p;
    // p = c;
    // c = n;
    // } else {
    // return p;
    // }

    // return reverse(p, c, n);
    // }
}
