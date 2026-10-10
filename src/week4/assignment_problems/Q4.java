package main.java.week4.assignment_problems;

import java.util.*;

class Q4 {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Empty prefix
        map.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum = currentSum + num;

            int required = currentSum - k;

            if (map.containsKey(required)) {
                count = count + map.get(required);
            }

            map.put(
                    currentSum,
                    map.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }
}
