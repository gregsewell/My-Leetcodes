package org.gregsewell;

import java.util.Arrays;

class LongestPalindrome {
    public static String longestPalindrome(String s) {

        int n = s.length();
        if (n == 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        int minLength = 0;
        int minLeftIndex = 0;
        int maxRightIndex = 0;

        // For each centre position - expand out and check for a palindrome
        for (int centre=0; centre <= n-1; centre++) {
            // Current left/right indexes
            int leftIndex = centre;
            int rightIndex = centre;

            boolean palindrome = true;

            int leftPalindromeIndex = leftIndex;
            int rightPalindromeIndex = rightIndex;

            // Expand to the right until not a palindrome
            while (palindrome && leftIndex > 0 & rightIndex < n-1) {
                while (isPalindrome(Arrays.copyOfRange(chars, leftIndex, rightIndex+1))) {
                    rightPalindromeIndex = rightIndex;
                    if (rightIndex < chars.length -1) {
                        rightIndex++;
                    }
                    else {
                        break;
                    }
                }
                palindrome = false;

                if (leftIndex > 0) {
                    leftIndex--;
                }

                // Expand to the left by 1 and check if it is still a palindrome
                if (isPalindrome(Arrays.copyOfRange(chars, leftIndex, rightIndex+1))) {
                    palindrome = true;
                    leftPalindromeIndex = leftIndex;
                }
            }

            if (leftPalindromeIndex < centre || rightPalindromeIndex > centre) {
                int length = rightPalindromeIndex - leftPalindromeIndex + 1;
                if (length > minLength) {
                    minLength = length;
                    minLeftIndex = leftPalindromeIndex;
                    maxRightIndex = rightPalindromeIndex;
                }
                System.out.println("New longest palindrome " + String.valueOf(Arrays.copyOfRange(chars, minLeftIndex, maxRightIndex+1)));
            }

        }
        return String.valueOf(Arrays.copyOfRange(chars, minLeftIndex, maxRightIndex+1));
    }




    public static boolean isPalindrome(char[] chars) {
        if (chars.length == 1) {
            return true;
        }
        if (chars.length == 2) {
            return chars[0] == chars[1];
        }
        for (int i=0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length-1-i]) {
                return false;
            }
        }
        return true;
    }


    // Brute force approach O(n*n*n)- timeout for large n
        /*
        String result = "";
        int n = s.length();
        for (int i=0; i < n; i++) {
            for (int j=i+1; j <= n; j++) {
                String substr = s.substring(i,j);
                String reverse = new StringBuilder(substr).reverse().toString();
                if (reverse.equals(substr) && substr.length() > result.length()) {
                    result = substr;
                }
            }
        }
        return result;
        */

}
