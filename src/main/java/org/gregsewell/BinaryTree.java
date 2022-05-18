package org.gregsewell;

public class BinaryTree<T> {

    private Node<T> root;



    private static class Node<T> {

        private Node<T> left;
        private Node<T> right;
        private T data;

        public Node(T data) {
            this.data = data;
        }

    }

}
