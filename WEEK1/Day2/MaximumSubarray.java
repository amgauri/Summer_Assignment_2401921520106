class MaximumSubarray {

    public static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // either start new subarray
            // or continue previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-7, 2, -4, 4, -5, 2, 1, -5, 6};

        int ans = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + ans);
    }
}