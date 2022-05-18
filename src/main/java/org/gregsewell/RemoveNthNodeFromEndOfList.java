package org.gregsewell;

public class RemoveNthNodeFromEndOfList {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // Want to get the list.length() - nth node from the start of the list.
        int listLength = 1;
        ListNode nextNode = head;
        while(nextNode.next != null) {
            listLength++;
            nextNode = nextNode.next;
        }

        int targetNodePos = listLength - n;
        ListNode targetNode = head;
        for (int i = 1; i < targetNodePos; i++) {
            targetNode = targetNode.next;
        }

        if (targetNode.next == null) {
            return null;
        }

        // Special case when targetNode is the head
        if (targetNode == head && n==listLength) {
            head = targetNode.next;
            return head;
        }

        if (targetNode.next != null) {
            if (targetNode.next.next != null) {
                targetNode.next = targetNode.next.next;
            }
            else {
                targetNode.next = null;
            }
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
