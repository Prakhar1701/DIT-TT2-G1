// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

//Reverse the data

public class S5a {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node reverseList(Node head) {

        Node t = head;

        int lenght = 0;

        while (t != null) {
            lenght++;
            t = t.next;
        }

        for (int i = 1; i < lenght; i++) {

            t = head;

            for (int j = i; j < lenght; j++) {

                int d = t.data;

                t.data = t.next.data;

                t.next.data = d;

                t = t.next;
            }

        }

        return head;
    }

}
