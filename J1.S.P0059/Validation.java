
import java.io.File;
import java.util.Scanner;

public class Validation {
    private static Scanner sc = new Scanner(System.in);
    
     public static int checkInputIntLimit(int min, int max) {
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
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }  
    
    //check user input double
    public static double checkInputDouble() {
        System.out.print("Enter money: ");
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //check file exist or not and path must be file
    public static String checkInputPathFile() {
        System.out.print("Enter Path: ");
        while (true) {
            String path = sc.nextLine().trim();
            File file = new File(path);
            try {
                if (!file.exists() || !file.isFile()) {
                    throw new Exception();
                }
                return path;
            } catch (Exception e) {
                System.err.println("Path doesn't exist");
                System.out.print("Enter again: ");
            }
        }
    }
}
