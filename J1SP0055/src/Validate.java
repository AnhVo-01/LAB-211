
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

    //check user input int
    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number integer");
                System.out.print("Enter again: ");
            }
        }
    }


//    //check code exist or not
//    public static boolean checkCodeExist(String code) {
//        DoctorHash dh = new DoctorHash();
//        if (dh.findById(code) == null){
//            return false;
//        }
//        return true;
//    }
    
//    //check doctor duplicate
//    public static boolean checkDuplicate(String code, String name, String specialization, int availability) {
//        //check from first to last list doctor
//        Doctor doctor = new Doctor();
//        if (code.equalsIgnoreCase(doctor.getCode())&&
//            name.equalsIgnoreCase(doctor.getName())&&
//            specialization.equalsIgnoreCase(doctor.getSpecialization())&&
//            availability == doctor.getAvail()) {
//                return false;
//            }   
//        return true;
//    }
    
    public static boolean checkChangeInfo(Doctor doctor, String code,
           String name, String specialization, int availability) {
        if (doctor.getCode().equalsIgnoreCase(code)
                && doctor.getName().equalsIgnoreCase(name)
                && doctor.getSpecialization().equalsIgnoreCase(specialization)
                && doctor.getAvail() == availability) { 
            return false;
        }
        return true;
    }
    
}



