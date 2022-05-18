package org.gregsewell;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchTree {

    Node root;

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        }
        else {
            root.insert(data);
        }
    }

    // left, node, right
    public int[] traverseInOrder() {
        return root.traverseInOrder().stream().mapToInt(Integer::intValue).toArray();
    }

    // node, left, right
    public int[] traversePreOrder() {
        return root.traversePreOrder().stream().mapToInt(Integer::intValue).toArray();
    }

    // left, right, node
    public int[] traversePostOrder() {
        return root.traversePostOrder().stream().mapToInt(Integer::intValue).toArray();
    }

    public static class Node {

        private Node left;
        private Node right;
        private final int data;

        private Node(int data) {
            this.data = data;
        }

        private void insert(int data) {
            if (data <= this.data) {
                if (left == null) {
                    left = new Node(data);
                }
                else {
                    left.insert(data);
                }
            }
            else {
                if (right == null) {
                    right = new Node(data);
                }
                else {
                    right.insert(data);
                }
            }
        }

        private boolean contains(int data) {
            if (this.data == data) {
                return true;
            }
            if (data < this.data) {
                if (left == null) {
                    return false;
                }
                else {
                    return left.contains(data);
                }
            }
            else {
                if (right == null) {
                    return false;
                }
                else {
                    return right.contains(data);
                }
            }
        }

        // left, node, right
        public List<Integer> traverseInOrder() {
            List<Integer> result = new ArrayList<>();
            if (left != null) {
                result.addAll(left.traverseInOrder());
            }
            result.add(data);
            if (right != null) {
                result.addAll(right.traverseInOrder());
            }
            return result;
        }

        // node, left, right
        public List<Integer> traversePreOrder() {
            List<Integer> result = new ArrayList<>();

            result.add(data);
            if (left != null) {
                result.addAll(left.traversePreOrder());
            }
            if (right != null) {
                result.addAll(right.traversePreOrder());
            }
            return result;
        }

        // left, right, node
        public List<Integer> traversePostOrder() {
            List<Integer> result = new ArrayList<>();

            if (left != null) {
                result.addAll(left.traversePostOrder());
            }
            if (right != null) {
                result.addAll(right.traversePostOrder());
            }
            result.add(data);
            return result;
        }
    }
}
