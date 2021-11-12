
import java.io.*;
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
    public static String checkUserName(){
        System.out.print("Enter Username: ");
        while(true){
            try{
                String result = sc.nextLine().trim();
                if(!result.matches("[0-9a-zA-Z!.#$@_+,?-]{5,}$")){
                    throw new Exception();
                }
                return result;
            }catch(Exception e){
                System.err.println("Username must be at least 5 characters and no spaces");
                System.out.print("Enter again: ");
            }
        }       
    }
    public static String checkInputPassword() {
        System.out.print("Enter Password: ");
        while (true) {
            String result = sc.nextLine().trim();
            if (result.matches("[0-9a-zA-Z!.#$@_+,?-]{6,}$")) {
                return result;
            }
            System.err.println("You must enter least at 6 character, and no space!");
            System.out.print("Enter again: ");
        }
    }
    public static boolean checkUsernameExist(String username) {
        File file = new File("user.dat");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s; String []a;
            while (true){
                s = br.readLine();
                if(s == null ) break;
                a = s.split(";");
                if (username.equalsIgnoreCase(a[0])) {
                    throw new IOException();
                }
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.err.println("Username exist.");
            return false;
        }
        return true;
    }
    
    public static boolean checkFileExist() throws IOException {
        File file = new File("user.dat");
        try {
            if (!file.exists() || !file.isFile()) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.err.println("File doesn't exist");
            file.createNewFile();
            System.err.println("File created.");
        }
        return true;
    }
}
