package org.gregsewell;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    @Test
    public void test() {

        assertEquals(0, ReverseInteger.reverseInteger(0));
        assertEquals(12, ReverseInteger.reverseInteger(21));
        assertEquals(1, ReverseInteger.reverseInteger(10));
        assertEquals(654321, ReverseInteger.reverseInteger(123456));
        assertEquals(0, ReverseInteger.reverseInteger(2147483647));
        assertEquals(-321, ReverseInteger.reverseInteger(-123));

    }
}
