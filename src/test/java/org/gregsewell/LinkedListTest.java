package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListTest {

    @Test
    public void testAppend() {

        LinkedList<String> target = new LinkedList<>();

        target.append("one");
        target.append("two");
        target.append("three");
        target.append("four");

        assertEquals("one", target.getFirst());
        assertEquals("four", target.getLast());
    }

    @Test
    public void testGet() {

        LinkedList<String> target = new LinkedList<>();

        target.append("one");
        target.append("two");
        target.append("three");
        target.append("four");

        assertEquals("one", target.get(0));
        assertEquals("two", target.get(1));
        assertEquals("three", target.get(2));
        assertEquals("four", target.get(3));
        assertNull(target.get(4));
    }

    @Test
    public void testPrepend() {

        LinkedList<String> target = new LinkedList<>();

        target.prepend("a");
        target.prepend("b");
        target.prepend("c");

        assertEquals("c", target.getFirst());
        assertEquals("a", target.getLast());

        assertEquals("c", target.get(0));
        assertEquals("b", target.get(1));
        assertEquals("a", target.get(2));
    }

    @Test
    public void testRemoveFirstTargetIsNotHead() {

        LinkedList<String> target = new LinkedList<>();

        target.append("a");
        target.append("b");
        target.append("c");
        target.append("d");
        target.append("c");

        target.removeFirst("c");

        assertEquals("a", target.getFirst());
        assertEquals("c", target.getLast());

        assertEquals("a", target.get(0));
        assertEquals("b", target.get(1));
        assertEquals("d", target.get(2));
        assertEquals("c", target.get(3));
        assertNull(target.get(4));
    }

    @Test
    public void testRemoveFirstTargetIsHead() {

        LinkedList<String> target = new LinkedList<>();

        target.append("a");
        target.append("b");
        target.append("c");
        target.append("d");
        target.append("c");

        target.removeFirst("a");

        assertEquals("b", target.getFirst());
        assertEquals("c", target.getLast());

        assertEquals("b", target.get(0));
        assertEquals("c", target.get(1));
        assertEquals("d", target.get(2));
        assertEquals("c", target.get(3));
        assertNull(target.get(4));
    }

    @Test
    public void testRemoveLastTargetIsTail() {

        LinkedList<String> target = new LinkedList<>();

        target.append("a");
        target.append("b");
        target.append("c");
        target.append("d");
        target.append("c");

        target.removeLast("c");

        assertEquals("a", target.getFirst());
        assertEquals("d", target.getLast());

        assertEquals("a", target.get(0));
        assertEquals("b", target.get(1));
        assertEquals("c", target.get(2));
        assertEquals("d", target.get(3));
        assertNull(target.get(4));
    }

    @Test
    public void testRemoveLastTargetIsNotTail() {

        LinkedList<String> target = new LinkedList<>();

        target.append("a");
        target.append("b");
        target.append("c");
        target.append("d");
        target.append("c");
        target.append("z");


        target.removeLast("c");

        assertEquals("a", target.getFirst());
        assertEquals("z", target.getLast());

        assertEquals("a", target.get(0));
        assertEquals("b", target.get(1));
        assertEquals("c", target.get(2));
        assertEquals("d", target.get(3));
        assertEquals("z", target.get(4));
        assertNull(target.get(5));
    }
}
