package WEEK2.DAY4;

import java.util.*;

public class DecodeString {

    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<StringBuilder> textStack = new Stack<>();

        StringBuilder runningText = new StringBuilder();
        int repeatValue = 0;

        for (int index = 0; index < s.length(); index++) {
            char symbol = s.charAt(index);

            if (Character.isDigit(symbol)) {
                // number multiple digit bhi ho sakta hai, jaise 12[a]
                repeatValue = repeatValue * 10 + (symbol - '0');
            } 
            else if (symbol == '[') {
                // ab tak ka number aur text save kar do
                numberStack.push(repeatValue);
                textStack.push(runningText);

                repeatValue = 0;
                runningText = new StringBuilder();
            } 
            else if (symbol == ']') {
                int times = numberStack.pop();
                StringBuilder oldText = textStack.pop();

                // bracket ke andar wala text repeat karo
                for (int round = 0; round < times; round++) {
                    oldText.append(runningText);
                }

                runningText = oldText;
            } 
            else {
                runningText.append(symbol);
            }
        }

        return runningText.toString();
    }

    public static void main(String[] args) {
        DecodeString task = new DecodeString();

        String code = "3[a2[c]]";

        System.out.println(task.decodeString(code));
    }
}

