package WEEK3.Day3;

import java.util.Stack;

public class MinStack {

    Stack<Integer> mainBox;
    Stack<Integer> minBox;

    public MinStack() {
        mainBox = new Stack<>();
        minBox = new Stack<>();
    }

    public void push(int val) {
        mainBox.push(val);

        // minBox me hamesha current minimum store rahega
        if (minBox.isEmpty() || val <= minBox.peek()) {
            minBox.push(val);
        }
    }

    public void pop() {
        int removed = mainBox.pop();

        if (removed == minBox.peek()) {
            minBox.pop();
        }
    }

    public int top() {
        return mainBox.peek();
    }

    public int getMin() {
        return minBox.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(-2);
        stack.push(0);
        stack.push(-3);

        System.out.println(stack.getMin()); // -3

        stack.pop();

        System.out.println(stack.top());    // 0
        System.out.println(stack.getMin()); // -2
    }
}
