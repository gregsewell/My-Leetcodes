package org.gregsewell;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    public T getFirst() {
        return head.getData();
    }

    public T getLast() {
        return tail.getData();
    }

    public T get(int position) {

        if (position == 0) {
            return head.getData();
        }

        Node<T> current = head;
        for (int i=0 ; i < position; i++) {
            if (current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }
        return current.getData();
    }

    public void append(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
            return;
        }
        Node<T> newNode = new Node<>(data);
        newNode.setPrevious(tail);
        tail.setNext(newNode);
        tail = newNode;
    }

    public void prepend(T data) {
        if (head == null) {
            head = new Node<>(data);
            tail = head;
            return;
        }
        Node<T> newNode = new Node<>(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void removeFirst(T data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            head.previous = null;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next.next.previous = current;
                current.next = current.next.next;
                return;
            }
            else {
                current = current.next;
            }
        }
    }

    public void removeLast(T data) {
        if (head == null) {
            return;
        }

        if (tail.data.equals(data)) {
            tail = tail.previous;
            tail.next = null;
            return;
        }

        Node<T> current = tail;
        while (current.previous != null) {
            if (current.previous.data.equals(data)) {
                current.previous.previous.next = current;
                current.previous = current.previous.previous;
                return;
            }
            else {
                current = current.previous;
            }
        }
    }


    private static class Node<T> {

        private Node<T> previous;
        private Node<T> next;

        private T data;

        public Node(T data) {
            this.data = data;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}





