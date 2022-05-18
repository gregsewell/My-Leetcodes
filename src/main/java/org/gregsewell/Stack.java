package org.gregsewell;

public class Stack<T> {

    private Node<T> top;

    public void push(T data) {
        if (top == null) {
            top = new Node<>(data);
            return;
        }

        Node<T> newTop = new Node<>(data);
        newTop.next = top;
        top = newTop;
    }

    public T pop() {
        if (top == null) {
            return null;
        }
        T result = top.data;
        top = top.next;
        return result;
    }

    public T peek() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    private static class Node<T> {
        private final T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

}
