// https://practice.geeksforgeeks.org/problems/split-singly-linked-list-alternatingly/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class S8 {

    class Node {
        int data;
        Node next;

        public Node(int head) {
            this.data = head;
            this.next = null;
        }
    }

    class GFG {
        public static Node a; // store the head of first list in this
        public static Node b; // store the head of second list in this
    }

    class Solution {

        public void alternatingSplitList(Node head) {

            if (head == null) {

                GFG.a = null;
                GFG.b = null;

            } else if (head.next == null) {

                GFG.a = head;
                GFG.b = null;

            }

            GFG.a = head;
            GFG.b = head.next;

            Node t1 = GFG.a;
            Node t2 = GFG.b;

            while (t1.next != null && t2.next != null) {

                t1.next = t1.next.next;
                t2.next = t2.next.next;

                t1 = t1.next;
                t2 = t2.next;
            }

            t1.next = null;

        }
    }

}
