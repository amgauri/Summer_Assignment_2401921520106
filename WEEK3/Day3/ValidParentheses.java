package WEEK3.Day3;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> box = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                box.push(ch);
            } else {
                if (box.isEmpty()) return false;

                char top = box.pop();

                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        return box.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();

        String s = "()[]{}";
        System.out.println(obj.isValid(s));
    }
}
