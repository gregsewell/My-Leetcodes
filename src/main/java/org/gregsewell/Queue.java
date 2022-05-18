package org.gregsewell;

public class Queue<T> {

    private Node<T> front;
    private Node<T> back;

    public void enqueue(T data) {
        Node<T> node = new Node<T>(data);
        if (back == null) {
            back = node;
            front = back;
            return;
        }
        node.next = back;
        back.previous = node;
        back = node;
    }

    public T dequeue() {
        if (front == null) {
            return null;
        }
        Node<T> toRemove = front;

        if (front.previous != null) {
            front = front.previous;
            front.next = null;
        }
        else {
            front = null;
        }
        return toRemove.data;
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
