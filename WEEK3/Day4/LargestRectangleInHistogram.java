package WEEK3.Day4;

import java.util.Stack;

public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> indexStack = new Stack<>();
        int bestArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int currentHeight = (i == heights.length) ? 0 : heights[i];

            while (!indexStack.isEmpty() && currentHeight < heights[indexStack.peek()]) {
                int height = heights[indexStack.pop()];

                int width;
                if (indexStack.isEmpty()) {
                    width = i;
                } else {
                    width = i - indexStack.peek() - 1;
                }

                bestArea = Math.max(bestArea, height * width);
            }

            indexStack.push(i);
        }

        return bestArea;
    }

    public static void main(String[] args) {
        LargestRectangleInHistogram obj = new LargestRectangleInHistogram();

        int[] heights = {2, 1, 5, 6, 2, 3};

        System.out.println(obj.largestRectangleArea(heights)); // 10
    }
}