package WEEK1.Day4;

public class MatrixDiagonalSum {
    
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sumValue = 0;

        for (int pos = 0; pos < size; pos++) {
            // Add primary diagonal
            sumValue += mat[pos][pos];

            // Add secondary diagonal only if it is not the same middle element
            int mirrorPos = size - 1 - pos;
            if (mirrorPos != pos) {
                sumValue += mat[pos][mirrorPos];
            }
        }

        return sumValue;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        MatrixDiagonalSum obj = new MatrixDiagonalSum();
        System.out.println("Diagonal Sum = " + obj.diagonalSum(matrix));
    }
    }
    

