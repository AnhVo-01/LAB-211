
import java.util.Locale;

public class Manages {
    Ebank e = new Ebank();
    Locale locale;
    public int Menu() {
        System.out.println("-------Login Program-------");
        System.out.print("1. Vietnamese\n"+
                         "2. English\n"+
                         "3. Exit\n");
        System.out.println("---------------------------");
        System.out.print("Please choice one option: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }
    
    public void Vietnamese(){
        locale = new Locale("Vi");
        e.setLocale(locale);
        login();
    }
    public void English(){
        locale = new Locale("En");
        e.setLocale(locale);
        login();
    }
    
    void login() {
        System.out.println("\n---------- LOGIN ----------");
        while (true) {
            System.out.print(e.getBundle().getString("account"));
            String acc = Validation.checkInputString();
            if (e.checkAccountNumber(acc).equals("")) {
                break;
            }else{
                System.err.println(e.checkAccountNumber(acc));
            }
        }
        while (true) {
            System.out.print(e.getBundle().getString("password"));
            String pass = Validation.checkInputString();
            if (e.checkPassword(pass).equals("")) {
                break;
            } else {
                System.err.println(e.checkPassword(pass));
            }
        }
        String captchaGenerate = e.generateCaptcha();
        System.out.println("Captcha: " + captchaGenerate);
        while (true) {  
            System.out.print(e.getBundle().getString("captchaInput"));
            String captchaInput = Validation.checkInputString();
            if (e.checkCaptcha(captchaInput, captchaGenerate).equals("")) { 
                System.out.println("Success!\n");
                break;
            }else{
                System.err.println(e.checkCaptcha(captchaInput,captchaGenerate));
            }
        }
    }
}


//System.out.print(e.getBundle().getString("captchaInputN"));
//                String captchaInputN = Validation.checkInputString();              
//                if(e.checkCaptcha(captchaInputN, captchaGenerate).equals("")){
//                    System.out.println("Success!\n");
//                    break;
//                }