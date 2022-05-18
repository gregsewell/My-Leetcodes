package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StackTest {

    @Test
    public void testStack() {

        Stack<String> target = new Stack<>();

        assertNull(target.peek());
        assertNull(target.pop());

        target.push("c");
        target.push("b");
        target.push("a");

        assertEquals("a", target.peek());
        assertEquals("a", target.pop());
        assertEquals("b", target.peek());
        assertEquals("b", target.pop());
        assertEquals("c", target.peek());
        assertEquals("c", target.pop());

        assertNull(target.peek());
        assertNull(target.pop());
    }

}
