public class ToeplitzMatrix {
    public static void main(String[] args) {

    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length, col;
        if (row != 0)
            col = matrix[0].length;
        else
            return true;
        for (int k = 1 - col; k <= 0; k++) {
            int num = matrix[0][-k];
            for (int i = 1; i < row; i++) {
                if (i - k >= col) break;
                if (matrix[i][i - k] != num) return false;
            }
        }
        for (int k = 1; k < row; k++) {
            int num = matrix[k][0];
            for (int j = 0; j < col; j++) {
                if (j + k >= row) break;
                if (matrix[j + k][j] != num) return false;
            }
        }
        return true;
    }
}
