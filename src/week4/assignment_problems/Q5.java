package main.java.week4.assignment_problems;

class Q5 {

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {

                left = mid + 1;

            } else {

                right = mid;
            }
        }

        return nums[left];
    }
}
