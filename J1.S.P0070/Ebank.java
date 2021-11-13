
import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

public class Ebank {

    ResourceBundle bundle;
    
    public void setLocale(Locale locale) {
        bundle = ResourceBundle.getBundle("language", locale);
    }
    public ResourceBundle getBundle() {
        return bundle;
    }
    public String checkAccountNumber(String accountNumber) {
        StringBuilder s = new StringBuilder();
        if (!accountNumber.matches("[0-9]{10}$")) {
            s.append(getBundle().getString("accountErr"));
        }
        return s.toString();
    }

    public String checkPassword(String password) {
        StringBuilder s = new StringBuilder();
        if (!password.matches("^(?=.*[A-Za-z])(?=.*[0-9])[0-9a-zA-Z!.#$@_+,?-]{8,31}$")) {
            s.append(getBundle().getString("passwordErr"));
            return s.toString();
        }
        return s.toString();
    }

    public String generateCaptcha() {
        StringBuilder captcha = new StringBuilder();
        Random rd = new Random();
        String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i=0; i<6; i++) {
            int temp = rd.nextInt(s.length());
            captcha.append(s.charAt(temp));
        }
        return captcha.toString();
    }

    public String checkCaptcha (String captchaInput, String captchaGenerate){
        StringBuilder s = new StringBuilder();
        if (!captchaInput.matches("[a-zA-Z0-9]{1,6}$")){
            s.append(getBundle().getString("captchaErr"));
        }      
        else if (!captchaGenerate.contains(captchaInput)) {
            s.append(getBundle().getString("captchaErr"));
        }
        return s.toString();
    }
}
