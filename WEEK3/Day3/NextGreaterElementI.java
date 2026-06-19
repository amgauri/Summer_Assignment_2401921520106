package WEEK3.Day3;

import java.util.HashMap;
import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextMap = new HashMap<>();
        Stack<Integer> waitingStack = new Stack<>();

        for (int num : nums2) {
            while (!waitingStack.isEmpty() && waitingStack.peek() < num) {
                nextMap.put(waitingStack.pop(), num);
            }

            waitingStack.push(num);
        }

        int[] answer = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            answer[i] = nextMap.getOrDefault(nums1[i], -1);
        }

        return answer;
    }

    public static void main(String[] args) {
        NextGreaterElementI obj = new NextGreaterElementI();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(obj.nextGreaterElement(nums1, nums2)));
    }
}