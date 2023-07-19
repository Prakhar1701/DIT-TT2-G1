// https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1

/*
Given a singly linked list of size N. The task is to swap elements in the linked list pairwise.
For example, if the input list is 1 2 3 4, the resulting list after swaps will be 2 1 4 3.
Note: You need to swap the nodes, not only the data. If only data is swapped then driver will print -1.
*/

public class S13 {
    // node class of the linked list
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    class Solution {
        // Function to pairwise swap elements of a linked list.
        // It should returns head of the modified list
        public Node pairwiseSwap(Node head) {

            Node dummy = new Node(-1);
            dummy.next = head;
            Node t = dummy;

            while (t.next != null && t.next.next != null) {

                Node x = t.next;

                Node y = t.next.next;

                Node z = t.next.next.next;

                x.next = z;

                y.next = x;

                t.next = y;

                t = t.next.next;
            }

            head = dummy.next;

            return head;
        }
    }
}
