//https://practice.geeksforgeeks.org/problems/lru-cache/1

//Implemented Using Double Linked List

import java.util.HashMap;

public class S12 {

    class LRUCache {

        class Node {
            int key;
            int value;
            Node prev;
            Node next;

            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private int capacity;
        private HashMap<Integer, Node> cache;
        private Node head;
        private Node tail;

        LRUCache(int cap) {
            this.capacity = cap;
            cache = new HashMap<>();
            head = new Node(-1, -1);
            tail = new Node(-1, -1);
            head.next = tail;
            tail.prev = head;
        }

        // Function to get the value corresponding to the key.
        public int get(int key) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                removeNode(node);
                addToFront(node);
                return node.value;
            }
            return -1;
        }

        // Function to store key-value pair.
        public void set(int key, int value) {
            if (cache.containsKey(key)) {
                Node node = cache.get(key);
                node.value = value;
                removeNode(node);
                addToFront(node);
            } else {
                if (cache.size() >= capacity) {
                    cache.remove(tail.prev.key);
                    removeNode(tail.prev);
                }
                Node newNode = new Node(key, value);
                cache.put(key, newNode);
                addToFront(newNode);
            }
        }

        private void addToFront(Node node) {
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
            node.prev = head;
        }

        private void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

}
