
import java.util.Scanner;

public class Validation {
    static Scanner sc = new Scanner(System.in);
    //check user input number limit
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
    public static String checkBin() {
        System.out.print("Enter input value: ");
        while (true) {  
            String result = sc.nextLine().trim();
            if (result.matches("[0-1]*")) {
                return result;
            }
            System.err.println("The binary number system uses two unique digits (0 and 1)");
            System.out.print("Enter again: ");
        }
    }
    public static String checkDecimal() {
        System.out.print("Enter number decimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches("[0-9]*")) {
                return result;
            }
            System.err.println("The decimal number system uses digits 0-9");
            System.out.print("Enter again: ");
        }
    }
    public static String checkHexaDecimal() {
        System.out.print("Enter number hexadecimal: ");
        String result;
        while (true) {
            result = sc.nextLine().trim();
            if (result.matches("[0-9A-F]*")) {
                return result;
            }
            System.err.println("The decimal number system uses digits 0-9 A-F");
            System.out.print("Enter again: ");
        }
    }
   
    //check user input yes/ no
    public static boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                if (result.equalsIgnoreCase("Y")) {
                    return true;
                }
                if (result.equalsIgnoreCase("N")) {
                    return false;
                }
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
}
