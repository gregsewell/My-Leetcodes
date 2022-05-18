package org.gregsewell;

import org.junit.Test;

import java.util.List;

public class LetterCombinationsTest {

    @Test
    public void test() {

        List<String> result = LetterCombinations.letterCombinations("2345");
        System.out.println(result);

        result = LetterCombinations.letterCombinations("23");
        System.out.println(result);

        result = LetterCombinations.letterCombinations("");
        System.out.println(result);

        result = LetterCombinations.letterCombinations("2");
        System.out.println(result);

    }
}
