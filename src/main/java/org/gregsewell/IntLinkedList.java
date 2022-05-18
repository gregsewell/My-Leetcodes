package org.gregsewell;

public class IntLinkedList {

    Node head;

    public IntLinkedList(int value) {
        head = new Node(value);
    }

    void append(int value) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    void prepend(int value) {
        head = new Node(value, head);
    }

    void insertAfter(int after, int value) {
        Node current = head;
        while (current.value != after) {
            current = current.next;
        }
        current.next = new Node(value, current.next);
    }

    void removeWithValue(int value) {

        if (head.value == value) {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
