package org.gregsewell;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int n = nums.length;

        boolean permuted = false;

        int left = 0;
        int right = 0;

        outer:
        for (left = n-2; left >= 0; left--) {
            for (right = n-1; right > left; right--) {
                if (swap(nums, left, right)) {
                    // swapped two digits - descending sort all to the right of left
                    permuted = true;
                    break outer;
                }
            }
        }

        if (permuted) {
            // Sort unswapped values to right in ascending order
            Arrays.sort(nums, left+1, n);
        }
        else {
            // If can't permute - return lowest permutation
            Arrays.sort(nums);
        }
    }

    static boolean swap(int[] nums, int left, int right) {
        if (nums[left] < nums[right]) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            return true;
        }
        return false;
    }

}
