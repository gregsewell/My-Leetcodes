package org.gregsewell;

import java.util.*;

public class LetterCombinations {

    static Map<Character, String> map = new HashMap<>();

    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public static List<String> letterCombinations(String digits) {

        digits = digits.trim();
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        char[] nums = digits.toCharArray();
        // so e.g. ['2','3']

        List<String> chars = new ArrayList<>();
        for (char num : nums) {
            chars.add(map.get(num));
        }

        // Convert first entry to list of strings
        List<String> result = new ArrayList<>();
        for (int i=0; i < chars.get(0).length(); i++) {
            result.add(String.valueOf(chars.get(0).charAt(i)));
        }

        if (chars.size() == 1) {
            return result;
        }

        // Keep getting combinations of digits
        for (int i=1; i < chars.size(); i++) {
            result = multiply(result, chars.get(i));
        }
        return result;
    }

    private static List<String> multiply(List<String> strList, String str) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (String element : strList) {
                result.add("" + element + str.charAt(i));
            }
        }
        return result;
    }
}
