package org.gregsewell;

import org.junit.Test;
import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void test3_shouldPass() {
        assertEquals("Response should be 3 from III", RomanToInteger.romanToInt("III"), 3);
    }

    @Test
    public void test58_shouldPass() {
        assertEquals("Response should be 58 from LVIII", RomanToInteger.romanToInt("LVIII"), 58);
    }

    @Test
    public void test1994_shouldPass() {
        assertEquals("Response should be 1994 from MCMXCIV", RomanToInteger.romanToInt("MCMXCIV"), 1994);
    }
}
