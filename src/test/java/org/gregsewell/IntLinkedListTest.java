package org.gregsewell;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.gregsewell.IntLinkedList.Node;

public class IntLinkedListTest {

    @Test
    public void testConstructWithSingleNode() {
        IntLinkedList target = new IntLinkedList(5);
        assertEquals(target.head.value, 5);
    }

    @Test
    public void testAppendNode() {
        IntLinkedList target = new IntLinkedList(5);
        target.append(7);

        Node head = target.head;
        Node next = head.next;

        assertEquals(5, head.value);
        assertEquals(7, next.value);
    }

    @Test
    public void testPrependNode() {
        IntLinkedList target = new IntLinkedList(5);
        target.prepend(7);

        Node head = target.head;
        Node next = head.next;

        assertEquals(7, head.value);
        assertEquals(5, next.value);
    }

    @Test
    public void testInsertAfter() {
        IntLinkedList target = new IntLinkedList(1);
        target.append(2);
        target.append(3);

        Node head = target.head;

        assertEquals(1, head.value);
        assertEquals(2, head.next.value);
        assertEquals(3, head.next.next.value);

        target.insertAfter(2, -1);

        assertEquals(1, head.value);
        assertEquals(2, head.next.value);
        assertEquals(-1, head.next.next.value);
        assertEquals(3, head.next.next.next.value);
    }

    @Test
    public void testRemoveWith() {
        IntLinkedList target = new IntLinkedList(1);
        target.append(2);
        target.append(3);

        assertEquals(1, target.head.value);
        assertEquals(2, target.head.next.value);
        assertEquals(3, target.head.next.next.value);

        target.removeWithValue(3);

        assertEquals(1, target.head.value);
        assertEquals(2, target.head.next.value);
        assertNull(target.head.next.next);

        target.append(3);
        target.removeWithValue(2);
        assertEquals(1, target.head.value);
        assertEquals(3, target.head.next.value);
        assertNull(target.head.next.next);

        target.insertAfter(1, 2);
        target.removeWithValue(1);
        assertEquals(2, target.head.value);
        assertEquals(3, target.head.next.value);
        assertNull(target.head.next.next);


    }

}
