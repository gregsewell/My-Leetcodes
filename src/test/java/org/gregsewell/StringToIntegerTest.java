package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerTest {

    @Test
    public void test() {

        // Max int 2147483647
        // Min int -2147483648
        assertEquals(123, StringToInteger.myAtoi("123"));
        assertEquals(-123, StringToInteger.myAtoi("-123"));
        assertEquals(-123, StringToInteger.myAtoi("-123abc"));
        assertEquals(-123, StringToInteger.myAtoi("-000123abc"));
        assertEquals(Integer.MAX_VALUE, StringToInteger.myAtoi(String.valueOf(Integer.MAX_VALUE)));
        assertEquals(Integer.MIN_VALUE, StringToInteger.myAtoi(String.valueOf(Integer.MIN_VALUE)));
        assertEquals(Integer.MAX_VALUE, StringToInteger.myAtoi(String.valueOf("2147483648")));
        assertEquals(Integer.MIN_VALUE, StringToInteger.myAtoi(String.valueOf("-2147483649")));
        assertEquals(-42, StringToInteger.myAtoi(String.valueOf("       -42")));
        assertEquals(0, StringToInteger.myAtoi(String.valueOf("words and 987")));
        assertEquals(0, StringToInteger.myAtoi(String.valueOf("+-12")));
        assertEquals(0, StringToInteger.myAtoi(String.valueOf("+")));
        assertEquals(0, StringToInteger.myAtoi(String.valueOf("+abc")));
    }
}
