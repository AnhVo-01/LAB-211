public class Manage {
    Controllers ctr = new Controllers();
    int row1, col1;
    int row2, col2;
    public int menu(){
        System.out.println("=======Calculator program=======");
        System.out.print(" 1. Addition matrix\n"+
                         " 2. Subtraction matrix\n"+
                         " 3. Multiplication matrix\n"+
                         " 4. Quit\n");
        System.out.println("--------------------------------");
        System.out.print("Your choice: ");
        int out = Validation.checkInputIntLimit(1, 4);
        return out;
    }
    public int[][] inputMatrix(int n, int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + n + "[" + (i+1) + "]" + "[" + (j+1) + "]:");
                matrix[i][j] = Validation.checkInputInt();
            }
        }
        return matrix;
    }
    
    public void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
    public boolean checkMatrix(){
        if(col1 != col2 || row1 != row2){
            System.err.println("The number of rows and columns of the two matrix must be equal");
            return false;
        }
        return true;
    }
    public boolean checkMulti(){
        if(col1 != row2){
            System.err.println("The column of matrix1 and row of matrix2 must be equal");
            return false;
        }
        return true;
    }
    public void Matrix1(){
        System.out.print("Enter Row Matrix 1: ");
        row1 = Validation.checkInputInt();
        System.out.print("Enter Colum Matrix 1: ");
        col1 = Validation.checkInputInt();
    }
    public void Matrix2(){
        System.out.print("Enter Row Matrix 2: ");
        row2 = Validation.checkInputInt();
        System.out.print("Enter Colum Matrix 2: ");
        col2 = Validation.checkInputInt();
    }

    public void additionMatrix(){
        System.out.println("-------- Addition --------");
        Matrix1();
        int[][] matrix1 = inputMatrix(1,row1, col1);
        System.out.println("------------------");
        do{   
            Matrix2();
        }while(!checkMatrix());
        int[][] matrix2 = inputMatrix(2,row2, col2);
        
        System.out.println("-------- Result --------");
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(ctr.additionMatrix(matrix1, matrix2));   
    }
    public void subtractionMatrix(){
        System.out.println("-------- Subtraction --------");
        Matrix1();
        int[][] matrix1 = inputMatrix(1,row1, col1);
        System.out.println("------------------");
        do{   
            Matrix2();
        }while(!checkMatrix());
        int[][] matrix2 = inputMatrix(2,row2, col2);
        
        System.out.println("-------- Result --------");
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(ctr.subtractionMatrix(matrix1, matrix2));  
    }
    public void multiplicationMatrix(){
        System.out.println("-------- Multiplication --------");
        Matrix1();
        int[][] matrix1 = inputMatrix(1,row1, col1);
        System.out.println("------------------");
        do{   
            Matrix2();
        }while(!checkMulti());
        int[][] matrix2 = inputMatrix(2,row2, col2);
        
        System.out.println("-------- Result --------");
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(ctr.multiplicationMatrix(matrix1, matrix2));   
    }
}
