// https://leetcode.com/problems/copy-list-with-random-pointer/description/

import java.util.HashMap;

public class S11 {

    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    class Solution {
        public Node copyRandomList(Node head) {

            HashMap<Node, Node> map = new HashMap<>();

            Node t = head;

            while (t != null) {

                Node cn = new Node(t.val);

                map.put(t, cn);

                t = t.next;
            }

            t = head;

            while (t != null) {

                Node cn = map.get(t);

                cn.next = map.get(t.next);

                cn.random = map.get(t.random);

                t = t.next;
            }

            return map.get(head);
        }
    }

}
