package org.gregsewell;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void numberShouldBeFound() {
        int[] input = {-1,0,3,5,9,12};
        assertEquals(BinarySearch.search(input, 9), 4);
    }

    @Test
    public void numberShouldNotBeFound() {
        int[] input = {-1,0,3,5,9,12};
        assertEquals(BinarySearch.search(input, 15), -1);
    }

    @Test
    public void listSizeOne_numberShouldBeFound() {
        int[] input = {5};
        assertEquals(BinarySearch.search(input, 5), 0);
    }

    @Test
    public void listSizeOne_numberShouldNotBeFound() {
        int[] input = {5};
        assertEquals(BinarySearch.search(input, 10), -1);
    }
}
