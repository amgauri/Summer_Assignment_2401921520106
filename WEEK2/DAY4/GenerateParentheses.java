package WEEK2.DAY4;

import java.util.*;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> finalList = new ArrayList<>();

        makePairs(finalList, new StringBuilder(), 0, 0, n);

        return finalList;
    }

    private void makePairs(List<String> finalList, StringBuilder currentShape,
                           int openUsed, int closeUsed, int totalPairs) {

        if (currentShape.length() == totalPairs * 2) {
            finalList.add(currentShape.toString());
            return;
        }

        if (openUsed < totalPairs) {
            // pehle opening bracket lag sakta hai agar limit bachi ho
            currentShape.append('(');
            makePairs(finalList, currentShape, openUsed + 1, closeUsed, totalPairs);
            currentShape.deleteCharAt(currentShape.length() - 1);
        }

        if (closeUsed < openUsed) {
            // closing bracket tabhi lagega jab open bracket pehle se zyada ho
            currentShape.append(')');
            makePairs(finalList, currentShape, openUsed, closeUsed + 1, totalPairs);
            currentShape.deleteCharAt(currentShape.length() - 1);
        }
    }

    public static void main(String[] args) {
        GenerateParentheses task = new GenerateParentheses();

        System.out.println(task.generateParenthesis(3));
    }
}
