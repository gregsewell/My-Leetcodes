package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextPermutationTest {

    @Test
    public void test() {

        // Test {1,2,3}
        int[] input = new int[]{1,2,3};
        NextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{1,3,2}, input);

        // Test {1,1,5}
        input = new int[]{1,1,5};
        NextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{1,5,1}, input);

        // Test {3,2,1}
        input = new int[]{3,2,1};
        NextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{1,2,3}, input);

        // Test {2,3,1}
        input = new int[]{2,3,1};
        NextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{3,1,2}, input);

        // Test {2,1,4,3}
        input = new int[]{2,1,4,3};
        NextPermutation.nextPermutation(input);
        assertArrayEquals(new int[]{2,3,1,4}, input);
    }
}
