package org.gregsewell;

/**
 * Add two very large numbers by treating them as two linked lists
 */
public class AddTwoNumbersList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        int value = l1.val + l2.val;
        if (value >=  10) {
            carry = 1;
            value = value % 10;
        }

        ListNode result = new ListNode();
        ListNode l1Next = l1.next;
        ListNode l2Next = l2.next;

        if (l1Next != null && l2Next != null) {
            result.val = value;
            l1Next.val += carry;
            result.next = addTwoNumbers(l1Next, l2Next);
        }
        else if (l1Next == null && l2Next == null) {
            result.val = value;
            if (carry == 1) {
                l1Next = new ListNode(carry, null);
                l2Next = new ListNode(0, null);
                result.next = addTwoNumbers(l1Next, l2Next);
            }
        }
        else if (l1Next == null) {
            // l2Next != null
            result.val = value;
            l1Next = new ListNode(carry, null);
            result.next = addTwoNumbers(l1Next, l2Next);
        }
        else {
            // l2Next must be null
            result.val = value;
            l2Next = new ListNode(carry, null);
            result.next = addTwoNumbers(l1Next, l2Next);
        }
        return result;
    }

    /**
     * Definition of the linked list node that holds a digit value
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

}
