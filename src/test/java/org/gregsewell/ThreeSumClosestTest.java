package org.gregsewell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeSumClosestTest {

    @Test
    public void test() {

        // 2 is closest to 1 using [-1,2,1]
        assertEquals(2, ThreeSumClosest.threeSumClosest(new int[]{-1,2,1,-4}, 1));

        // 0 is closest to 1 using [2,1,-3]
        assertEquals(0, ThreeSumClosest.threeSumClosest(new int[]{0,2,1,-3}, 1));
    }
}
