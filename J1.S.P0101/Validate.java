
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {
    private final static Scanner sc = new Scanner(System.in);

    public static int inputIntLimit(int min, int max) {
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
    
    //check user input String
    public static String inputString(String msg, String err, String regex) {
        while (true) {
            System.out.print(msg);
            String result = sc.nextLine().trim();
            if (!result.matches(regex)) {
                System.err.println(err);
            } else {
                return result;
            }
        }
    }
    
    //check user input int
    public static int inputPhone() {
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

    //check user double
    public static double inputDouble(String msg, String err) {
        while (true) {
            try{
                System.out.print(msg);
                double result = Double.parseDouble(sc.nextLine().trim());     
                return result;
            }catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }
    
    // date format
    public static String inputDate(String msg, String err, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        while (true) {
            try {
                System.out.print(msg);
                String result = sc.nextLine().trim();
                Date date = sdf.parse(result);
                return sdf.format(date);
            } catch (ParseException e) {
                System.err.println(err);
            }
        }
    }
    
     public static boolean checkChangeInfo(Employee em, String id, String fname,
             String lname, int Phone, String Email, String Address, String DOB, 
             String Sex, double Salary, String Egency) {
        if (em.getId().equalsIgnoreCase(id)
                && em.getFirstName().equalsIgnoreCase(fname)
                && em.getLastName().equalsIgnoreCase(lname)
                && em.getPhone() == Phone
                && em.getEmail().equalsIgnoreCase(Email)
                && em.getAddress().equalsIgnoreCase(Address)
                && em.getDOB().equalsIgnoreCase(DOB)
                && em.getSex().equalsIgnoreCase(Sex)
                && em.getSalary() == Salary
                && em.getEgency().equalsIgnoreCase(Egency)) { 
            return false;
        }
        return true;
    }

    public static String inputSearchValue(String msg) {
        System.out.print(msg);
        String result = sc.nextLine();
        return result;
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

//    //check code exist or not
//    public static boolean checkCodeExist(String code) {
//        Controllers ctr = new Controllers();
//        return ctr.findById(code) != null;
//    }
    
}
