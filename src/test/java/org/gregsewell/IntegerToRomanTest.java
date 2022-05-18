package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test
    public void test3_shouldPass() {
        assertEquals("Response should be III from 3", IntegerToRoman.intToRoman(3), "III");
    }

    @Test
    public void test58_shouldPass() {
        assertEquals("Response should be LVIII from 58", IntegerToRoman.intToRoman(58), "LVIII");
    }

    @Test
    public void test1994_shouldPass() {
        assertEquals("Response should be MCMXCIV from 1994", IntegerToRoman.intToRoman(1994), "MCMXCIV");
    }
}
