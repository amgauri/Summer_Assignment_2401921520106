package WEEK1.Day3;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {

        // Two pointers: start and end
        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        // Loop until both pointers meet
        while (left < right) {

            // Width between two lines
            int width = right - left;

            // Height is limited by smaller line
            int minHeight = Math.min(height[left], height[right]);

            // Calculate area
            int currentArea = width * minHeight;

            // Update max area if current is bigger
            maxWater = Math.max(maxWater, currentArea);

            // Move the pointer of smaller height
            // Reason: smaller height is limiting factor, so we try to increase it
            if (height[left] < height[right]) {
                left++;   // try to find a taller line from left side
            } else {
                right--;  // try to find a taller line from right side
            }
        }

        return maxWater;
    }

    // Main method for testing
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = maxArea(height);

        System.out.println("Maximum water area = " + result);
    }
}