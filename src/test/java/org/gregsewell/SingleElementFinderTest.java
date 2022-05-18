package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SingleElementFinderTest {

    @Test
    public void shouldWork() {

        int[] input = new int[]{4, 5, 2, 2, 4, 5, 8};
        assertArrayEquals(new int[]{8}, SingleElementFinder.findSingle(input));

        int[] input2 = new int[]{4, 4};
        assertArrayEquals(new int[]{}, SingleElementFinder.findSingle(input2));

        int[] input3 = new int[]{4, 5, 2, 2, 4, 8};
        assertArrayEquals(new int[]{5, 8}, SingleElementFinder.findSingle(input3));
    }
}
