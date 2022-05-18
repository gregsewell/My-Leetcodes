package org.gregsewell;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> unique = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i=0; i < n-2; i++) {
            int target = -nums[i];
            int j = i+1;
            int k = n-1;

            while (j < k) {
                if (nums[j] + nums[k] == target) {
                    List<Integer> asList = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    if (unique.add(asList)) {
                        result.add(asList);
                    }
                    j++;
                    k--;
                    // If the numbers are duplicated it makes sense to skip repeats
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (k > j && nums[k] == nums[k+1]) k--;
                }
                else if (nums[j] + nums[k] < target) j++;
                else if (nums[j] + nums[k] > target) k--;
            }
        }

        /*
        Brute force solution
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i!=j && i!=k && j!=k  && (nums[i] + nums[j] + nums[k] == 0)) {
                        List<Integer> entry = new ArrayList<>();
                        entry.add(nums[i]);
                        entry.add(nums[j]);
                        entry.add(nums[k]);
                        Collections.sort(entry);
                        result.add(entry);
                    }
                }
            }
        }
        */
        return result;
    }
}
