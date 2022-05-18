package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.gregsewell.SwapNodesInPairs.ListNode;

public class SwapNodesInPairsTest {

    @Test
    public void testEven() {
        // [1,2,3,4,5,6]  => [2,1,4,3,6,5]
        ListNode sixth = new ListNode(6, null);
        ListNode fifth = new ListNode(5, sixth);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ListNode head = SwapNodesInPairs.swapPairs(first);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertEquals(6, head.next.next.next.next.val);
        assertEquals(5, head.next.next.next.next.next.val);
    }

    @Test
    public void testOdd() {
        // [1,2,3,4,5]  => [2,1,4,3,5]
        ListNode fifth = new ListNode(5, null);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        ListNode head = SwapNodesInPairs.swapPairs(first);
        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertEquals(4, head.next.next.val);
        assertEquals(3, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);

        assertNull(head.next.next.next.next.next);
    }

    @Test
    public void testSingle() {
        // [1]  => [1]
        ListNode first = new ListNode(1, null);

        ListNode head = SwapNodesInPairs.swapPairs(first);
        assertEquals(1, head.val);
        assertNull(head.next);
    }

    @Test
    public void testNull() {
        ListNode head = SwapNodesInPairs.swapPairs(null);
        assertNull(head);
    }

    @Test
    public void testPair() {
        //[1,2] => [1,2]
        ListNode second = new ListNode(2, null);
        ListNode first = new ListNode(1, second);
        ListNode head =  SwapNodesInPairs.swapPairs(first);

        assertEquals(2, head.val);
        assertEquals(1, head.next.val);
        assertNull(head.next.next);
    }
}
