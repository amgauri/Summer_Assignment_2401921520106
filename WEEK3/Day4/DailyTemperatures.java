package WEEK3.Day4;

import java.util.Stack;
import java.util.Arrays;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] daysWait = new int[n];

        Stack<Integer> indexBox = new Stack<>();

        for (int today = 0; today < n; today++) {
            while (!indexBox.isEmpty() && temperatures[today] > temperatures[indexBox.peek()]) {
                int oldDay = indexBox.pop();
                daysWait[oldDay] = today - oldDay;
            }

            indexBox.push(today);
        }

        return daysWait;
    }

    public static void main(String[] args) {
        DailyTemperatures obj = new DailyTemperatures();

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println(Arrays.toString(obj.dailyTemperatures(temperatures)));
    }
}