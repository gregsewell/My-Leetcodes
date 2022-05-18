package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QueueTest {

    @Test
    public void testEmptyQueue() {
        Queue<String> target = new Queue<>();
        assertNull(target.dequeue());
    }

    @Test
    public void testSingleNodeQueue() {
        Queue<String> target = new Queue<>();
        target.enqueue("a");
        assertEquals("a", target.dequeue());
        assertNull(target.dequeue());
    }

    @Test
    public void testMultipleNodesQueue() {
        Queue<String> target = new Queue<>();

        target.enqueue("a");
        target.enqueue("b");
        target.enqueue("c");
        target.enqueue("d");

        assertEquals("a", target.dequeue());
        assertEquals("b", target.dequeue());
        assertEquals("c", target.dequeue());
        assertEquals("d", target.dequeue());

        assertNull(target.dequeue());
    }
}
