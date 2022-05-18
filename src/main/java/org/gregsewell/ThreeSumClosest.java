package org.gregsewell;

import java.util.*;

import static java.lang.Math.abs;

/**
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
 */
public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {

        int runningDiff = Integer.MAX_VALUE;
        int result = 0;

        //Set<List<Integer>> unique = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n-2; i++) {
            // Want nums[j] and nums[k] to be as close to remaining as possible
            int remaining = target-nums[i];
            int j = i+1;
            int k = n-1;

            while (j < k) {
                if (nums[j] + nums[k] == remaining) {
                    // Perfect fit for i, j, k - can't get any better
                    return nums[i] + nums[j] + nums[k];
                }
                else {
                    int diff = Math.abs(remaining - (nums[j] + nums[k]));
                    if (diff < runningDiff) {
                        runningDiff = diff;
                        result = nums[i] + nums[j] + nums[k];
                    }
                    if (nums[j] + nums[k] < remaining) j++;
                    else if (nums[j] + nums[k] > remaining) k--;
                }
            }
        }
        return result;
    }

}
