package WEEK3.Day4;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> numberBox = new Stack<>();

        for (String item : tokens) {
            if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")) {
                int second = numberBox.pop();
                int first = numberBox.pop();

                if (item.equals("+")) {
                    numberBox.push(first + second);
                } else if (item.equals("-")) {
                    numberBox.push(first - second);
                } else if (item.equals("*")) {
                    numberBox.push(first * second);
                } else {
                    numberBox.push(first / second);
                }
            } else {
                numberBox.push(Integer.parseInt(item));
            }
        }

        return numberBox.peek();
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation obj = new EvaluateReversePolishNotation();

        String[] tokens = {"2", "1", "+", "3", "*"};

        System.out.println(obj.evalRPN(tokens)); // 9
    }
}
