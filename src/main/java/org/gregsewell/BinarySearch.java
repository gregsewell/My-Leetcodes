package org.gregsewell;

public class BinarySearch {

    public static int search(int[] nums, int target) {

        int startIndex = 0;
        int endIndex = nums.length-1;

        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex)/2;

            if (target == nums[midIndex]) {
                return midIndex;
            }
            if (target < nums[midIndex]) {
                // Search from startIndex -> midIndex
                endIndex = midIndex - 1;
            }
            else {
                // Search from midIndex -> endIndex
                startIndex = midIndex + 1;
            }
        }
        return -1;
    }

}
