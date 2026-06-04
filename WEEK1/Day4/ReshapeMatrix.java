package WEEK1.Day4;

public class ReshapeMatrix {
  
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int oldRows = mat.length;
        int oldCols = mat[0].length;

        // Reshape is only possible when total elements are equal
        if (oldRows * oldCols != r * c) {
            return mat;
        }

        int[][] reshaped = new int[r][c];
        int pointer = 0;

        for (int row = 0; row < oldRows; row++) {
            for (int col = 0; col < oldCols; col++) {
                // Convert 1D position into new 2D position
                reshaped[pointer / c][pointer % c] = mat[row][col];
                pointer++;
            }
        }

        return reshaped;
    }
}

