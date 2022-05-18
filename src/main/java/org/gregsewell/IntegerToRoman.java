package org.gregsewell;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert from an Integer to a Roman Numeral
 */
public class IntegerToRoman {

    private static final Map<Integer, Character> romans = new HashMap<>();

    static {
        romans.put(1, 'I');
        romans.put(5, 'V');
        romans.put(10, 'X');
        romans.put(50, 'L');
        romans.put(100, 'C');
        romans.put(500, 'D');
        romans.put(1000, 'M');
    }

    public static String intToRoman(int num) {

        int thousands = num / 1000;
        int fivehundreds = num % 1000 / 500;
        int hundreds = num % 1000 % 500 / 100;
        int fifties = num % 1000 % 500 % 100 / 50;
        int tens = num % 1000 % 500 % 100 % 50 / 10;
        int fives = num % 1000 % 500 % 100 % 50 % 10 / 5;
        int ones = num % 1000 % 500 % 100 % 50 % 10 % 5;

        StringBuilder builder = new StringBuilder();

        // Handle numerals between 1 and 9 so I to IX
        romanAppender(builder, ones, fives, 1, 5, 10);

        // Handle numerals between 10 and 99 so X to XCIX
        romanAppender(builder, tens, fifties, 10, 50, 100);

        // Handle numerals between 100 and 999 so C to CMCIX
        romanAppender(builder, hundreds, fivehundreds, 100, 500, 1000);

        // Handle any remaining thousands
        while (thousands > 0) {
            builder.append(romans.get(1000));
            thousands--;
        }

        return builder.reverse().toString();
    }

    private static void romanAppender(StringBuilder builder, int lowerCount, int groupCount, Integer lowerKey, Integer groupKey, Integer upperKey) {
        if (lowerCount == 4) {
            if (groupCount == 0) {
                builder.append(romans.get(groupKey));
                builder.append(romans.get(lowerKey));
            }
            else {
                builder.append(romans.get(upperKey));
                builder.append(romans.get(lowerKey));
            }
        }
        else {
            while (lowerCount > 0) {
                builder.append(romans.get(lowerKey));
                lowerCount--;
            }
            if (groupCount != 0) {
                builder.append(romans.get(groupKey));
            }
        }
    }

}
