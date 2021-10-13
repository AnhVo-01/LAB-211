
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
    
    //check user input string
    static String checkInputString() {
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
    
    //check user input float limit
    static float checkInputArea(float min, float max) {
        while (true) {        
            try {
                float result = Float.parseFloat(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();                   
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Total area must be number float and greater than 0");
                System.out.print("Enter again: ");
            }
        }
    }
    
}
