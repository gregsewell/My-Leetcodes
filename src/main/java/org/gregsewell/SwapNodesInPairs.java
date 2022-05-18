package org.gregsewell;

public class SwapNodesInPairs {

    public static ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.next != null) {
            // While there is still a pair of ListNodes

            ListNode first = current;
            ListNode second = current.next;

            if (previous != null) {
                previous.next = second;
            }
            previous = first;

            // Transpose the current pair of ListNodes
            first.next = second.next;
            second.next = first;

            if (current == head) {
                // At the start of the list
                head = second;
            }

            // Move to next ListNode pair
            current = first.next;
        }
        return head;
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
