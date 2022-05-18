package org.gregsewell;

import java.util.*;

/**
 * Given an array of numbers all of which are repeated more than once
 * except one, find the one that is present only once,
 *
 * so [4, 5, 2, 2, 4, 5, 8] would return 8.
 */
public class SingleElementFinder {

    public static int[] findSingle(int[] input) {

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int j : input) {
            countMap.put(j, countMap.getOrDefault(j, 0)+1);
        }

        return countMap.keySet().stream()
                .filter(key -> countMap.get(key).equals(1))
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
