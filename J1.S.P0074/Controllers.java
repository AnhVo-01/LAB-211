public class Controllers {
    public int[][] additionMatrix (int[][] matrix1, int[][]matrix2){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        
        int[][] matrix = new int[row1][col2];
        if (row1 == row2 && col1 == col2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }else{
            return null;
        }
        return matrix;
    }
    public int[][] subtractionMatrix (int[][] matrix1, int[][]matrix2){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        
        int[][] matrix = new int[row1][col2];
        if (row1 == row2 && col1 == col2) {
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    matrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }else{
            return null;
        }
        return matrix;
    }
    public int[][] multiplicationMatrix(int[][] matrix1, int[][]matrix2){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if (col1 != row2) {
            return null;
        }
        int[][] matrix = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                matrix[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix;
    }
}
