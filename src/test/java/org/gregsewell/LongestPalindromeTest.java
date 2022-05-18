package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void test() {
        //assertEquals("a", LongestPalindrome.longestPalindrome("a"));
        //assertEquals("a", LongestPalindrome.longestPalindrome("ab"));
        //assertEquals("a", LongestPalindrome.longestPalindrome("abc"));
        //assertEquals("aa", LongestPalindrome.longestPalindrome("aa"));
        //assertEquals("aaa", LongestPalindrome.longestPalindrome("aaaba"));
        //assertEquals("aaaa", LongestPalindrome.longestPalindrome("aaaa"));
        //assertEquals("abccba", LongestPalindrome.longestPalindrome("abccba"));
        assertEquals("abccba", LongestPalindrome.longestPalindrome("xabccbaf"));
        //assertEquals("abcdcba", LongestPalindrome.longestPalindrome("abcdcba"));
        //assertEquals("bbbb", LongestPalindrome.longestPalindrome("abbbb"));
        //assertEquals("bbb", LongestPalindrome.longestPalindrome("abbb"));
        //assertEquals("bb", LongestPalindrome.longestPalindrome("abb"));
        //assertEquals("aaaa", LongestPalindrome.longestPalindrome("aaaab"));
        //assertEquals("aaa", LongestPalindrome.longestPalindrome("aaab"));
        //assertEquals("aa", LongestPalindrome.longestPalindrome("aab"));
        //assertEquals("tattarrattat", LongestPalindrome.longestPalindrome("tattarrattat"));
    }

    //@Test
    public void testPalindrome() {
        assertTrue(LongestPalindrome.isPalindrome("a".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("ab".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("abc".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("abcd".toCharArray()));
        assertTrue(LongestPalindrome.isPalindrome("abba".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("abbd".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("abbbd".toCharArray()));
        assertTrue(LongestPalindrome.isPalindrome("abbba".toCharArray()));
        assertTrue(LongestPalindrome.isPalindrome("abbbba".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("abbbb".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("bbbba".toCharArray()));
        assertTrue(LongestPalindrome.isPalindrome("tattarrattat".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("tattarratta".toCharArray()));
        assertFalse(LongestPalindrome.isPalindrome("aaaba".toCharArray()));
        assertTrue(LongestPalindrome.isPalindrome("abccba".toCharArray()));
    }
}
