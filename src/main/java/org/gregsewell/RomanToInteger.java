package org.gregsewell;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert from a Roman Numeral to an Integer
 */
public class RomanToInteger {

    private static final Map<Character, Integer> romans = new HashMap<>();

    static {
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
    }

    // No safety checking on input because of given constraints
    public static int romanToInt(String s) {

        int result = 0;
        char[] chars = s.toCharArray();
        int length = chars.length;

        Integer previousValue = null;
        for (int i = length-1; i >= 0; i--) {
            char current = chars[i];
            Integer currentValue = romans.get(current);
            if (previousValue !=null && previousValue > currentValue) {
                result -= currentValue;
            }
            else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }
}
