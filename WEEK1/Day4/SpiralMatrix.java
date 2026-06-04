package WEEK1.Day4;
import java.util.*;
public class SpiralMatrix {
       public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();

        int upperLine = 0;
        int lowerLine = matrix.length - 1;
        int leftLine = 0;
        int rightLine = matrix[0].length - 1;

        while (upperLine <= lowerLine && leftLine <= rightLine) {
            
            // Traverse from left to right
            for (int column = leftLine; column <= rightLine; column++) {
                output.add(matrix[upperLine][column]);
            }
            upperLine++;

            // Traverse from top to bottom
            for (int row = upperLine; row <= lowerLine; row++) {
                output.add(matrix[row][rightLine]);
            }
            rightLine--;

            // Traverse from right to left
            if (upperLine <= lowerLine) {
                for (int column = rightLine; column >= leftLine; column--) {
                    output.add(matrix[lowerLine][column]);
                }
                lowerLine--;
            }

            // Traverse from bottom to top
            if (leftLine <= rightLine) {
                for (int row = lowerLine; row >= upperLine; row--) {
                    output.add(matrix[row][leftLine]);
                }
                leftLine++;
            }
        }

        return output;
    }
    public static void main(String[] args) {
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    SpiralMatrix obj = new SpiralMatrix();

    List<Integer> result = obj.spiralOrder(matrix);

    System.out.println("Spiral Order:");
    System.out.println(result);
}
} 

