class MaximumAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        // calculating first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // sliding window starts here
        for (int i = k; i < nums.length; i++) {

            // add next element and remove previous element
            sum = sum + nums[i] - nums[i - k];

            // update maximum sum
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        // return average
        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 19, -4, -6, 50, 2};
        int k = 4;

        double ans = findMaxAverage(nums, k);

        System.out.println(ans);
    }
}