package org.gregsewell;

import org.junit.Test;
import org.gregsewell.RemoveNthNodeFromEndOfList.ListNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void test() {

        // [1,2,3,4,5] 2 => [1,2,3,5]
        ListNode fifth = new ListNode(5);
        ListNode fourth = new ListNode(4, fifth);
        ListNode third = new ListNode(3, fourth);
        ListNode second = new ListNode(2, third);
        ListNode first = new ListNode(1, second);

        assertEquals(1, first.val);
        assertEquals(2, first.next.val);
        assertEquals(3, first.next.next.val);
        assertEquals(4, first.next.next.next.val);

        ListNode head = RemoveNthNodeFromEndOfList.removeNthFromEnd(first, 2);

        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(5, head.next.next.next.val);
        assertNull(head.next.next.next.next);

        head = RemoveNthNodeFromEndOfList.removeNthFromEnd(first, 4);
        assertEquals(2, head.val);
        assertEquals(3, head.next.val);
        assertEquals(5, head.next.next.val);
        assertNull(head.next.next.next);

        // [1,2] 1 => [1]
        ListNode node = new ListNode(1);
        assertNull(RemoveNthNodeFromEndOfList.removeNthFromEnd(node, 1));

        ListNode nodeTwo = new ListNode(2, null);
        ListNode nodeOne = new ListNode(1, nodeTwo);
        assertEquals(nodeOne, RemoveNthNodeFromEndOfList.removeNthFromEnd(nodeOne, 1));
        assertNull(nodeOne.next);

        // [1,2] 2 => [2]
        nodeTwo = new ListNode(2, null);
        nodeOne = new ListNode(1, nodeTwo);
        assertEquals(nodeTwo, RemoveNthNodeFromEndOfList.removeNthFromEnd(nodeOne, 2));
        assertNull(nodeTwo.next);
    }
}
