package org.gregsewell;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-23^1, 23^1 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {

    public static int reverseInteger(int input) {

        boolean isNegative = false;
        if (input < 0) {
            input = input * -1;
            isNegative = true;
        }

        String reverseStr = new StringBuilder(String.valueOf(input)).reverse().toString();
        try {
            return isNegative? Integer.parseInt(reverseStr) * -1 : Integer.parseInt(reverseStr);
        }
        catch (NumberFormatException ex) {
            return 0;
        }
    }
}
