package org.gregsewell;

public class StringToInteger {

    public static int myAtoi(String s) {

        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        boolean explicitPositive = s.charAt(0) == '+';
        boolean isNegative = s.charAt(0) == '-';

        if (explicitPositive || isNegative) {
            s = s.substring(1);
        }

        if (s.isEmpty() || s.charAt(0) < '0' ||  s.charAt(0) > '9') {
            return 0;
        }

        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar >= '0' && aChar <= '9') {
                builder.append(aChar);
            }
            else {
                break;
            }
        }

        s = builder.toString();
        try {
            return isNegative? Integer.parseInt(s) * -1 : Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            if (isNegative) {
                return Integer.MIN_VALUE;
            }
            else {
                return Integer.MAX_VALUE;
            }
        }
    }
}
