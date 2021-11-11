
import java.util.Scanner;

public class Validation {
    static Scanner sc = new Scanner(System.in);
    static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();   
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Values of matrix must be the number");
                System.out.print("Enter-again: ");
            }
        }
    }
//    static int[][] checkInputMatrix(int n, int row, int col) {
//        int[][] matrix = new int[row][col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                try {
//                    System.out.print("Enter Matrix" + n + "[" + (i+1) + "]" + "[" + (j+1) + "]:");
//                    matrix[i][j] = Integer.parseInt(sc.nextLine().trim());
//                } catch (NumberFormatException e) {
//                    System.err.println("Values of matrix must be the number");
//                    System.out.print("Enter Matrix" + n + "[" + (i+1) + "]" + "[" + (j+1) + "]:");
//                    matrix[i][j] = Integer.parseInt(sc.nextLine().trim());
//                }
//            }
//        }
//        return matrix;
//    }
}
