package org.gregsewell;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.gregsewell.AddTwoNumbersList.ListNode;

public class AddTwoNumbersListTest {

    @Test
    public void addTwo_sameLength_shouldPass() {

        // Setup ListNodes for number 342
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);

        // Setup ListNodes number 465
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6, l4);
        ListNode l6 = new ListNode(5, l5);

        // Expected
        ListNode l7 = new ListNode(8);
        ListNode l8 = new ListNode(0, l7);
        ListNode l9 = new ListNode(7, l8);


        ListNode result = AddTwoNumbersList.addTwoNumbers(l3,l6);

        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    public void addTwo_lengthOne_shouldPass() {

        // Setup ListNodes for number 3
        ListNode l1 = new ListNode(3);

        // Setup ListNodes number 4
        ListNode l2 = new ListNode(4);

        // Expected
        ListNode l3 = new ListNode(7);

        ListNode result = AddTwoNumbersList.addTwoNumbers(l1,l2);
        assertEquals(7, result.val);
        assertNull(result.next);
    }

    @Test
    public void addTwo_differentLengths_shouldPass() {

        // Setup ListNodes for number 342
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);

        // Setup ListNodes number 465
        ListNode l4 = new ListNode(6);
        ListNode l5 = new ListNode(5, l4);

        // Expected
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(0, l7);
        ListNode l9 = new ListNode(4, l8);


        ListNode result = AddTwoNumbersList.addTwoNumbers(l3,l5);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(4, result.next.next.val);
    }


}
