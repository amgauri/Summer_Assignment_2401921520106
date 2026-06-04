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
    public static void main(String[] args) {
    int[][] matrix = {
        {1, 2},
        {3, 4}
    };

    ReshapeMatrix obj = new ReshapeMatrix();

    int[][] result = obj.matrixReshape(matrix, 1, 4);

    System.out.println("Reshaped Matrix:");

    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[0].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
}
}

