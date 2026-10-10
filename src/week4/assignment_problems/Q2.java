package main.java.week4.assignment_problems;

class Q2 {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maximum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i],
                    currentSum + nums[i]);

            maximum = Math.max(maximum, currentSum);
        }

        return maximum;
    }
}
