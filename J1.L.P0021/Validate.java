
import java.util.Scanner;

public class Validate {
    private final static Scanner sc = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
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
    public static String checkInputString() {
        //loop until user input correct
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

    
    //check user input yes/ no
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    
    public static boolean checkInputUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input U or D.");
            System.out.print("Enter again: ");
        }
    }
    
    //check user input course
    public static String checkInputCourse(String mess) {
        //loop until user input correct
        while (true) {
            System.out.print(mess);
            String result;
            result = sc.nextLine().trim();
            if (!result.isEmpty()){
                if (result.equalsIgnoreCase("java")
                        || result.equalsIgnoreCase(".net")
                        || result.equalsIgnoreCase("c/c++")) {
                    return result;
                }
                System.err.println("There are only three courses: Java, .Net, C/C++");
            }         
        }
    }
    
    public static boolean checkStudentExist(Students student, String id,
            String name, String semester, String courseName) {
        if (student.getId().equalsIgnoreCase(id)
                && student.getStudentName().equalsIgnoreCase(name)
                && student.getSemester().equalsIgnoreCase(semester)
                && student.getCourseName().equalsIgnoreCase(courseName)) { 
            return false;
        }
        return true;
    }
}
