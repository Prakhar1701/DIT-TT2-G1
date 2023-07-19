// https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class S2 {

    // Structure of node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {

        int length = 0;

        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (length < n || length < 1) {
            return -1;
        }

        temp = head;

        for (int i = 0; i < length - n; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

}
