
import java.io.*;

public class Controlles {
    public void addAccount(Account acc) throws Exception{
        File file = new File("user.dat");
        try {          
            FileWriter fw = new FileWriter(file, true);
            fw.write(acc.getUsername() + ";" + acc.getPassword() + "\n");
            fw.close();
        } catch (IOException e) {
            System.err.println("Can’t write file");
        } 
    }
    public Account find(Account acc) throws Exception{
        File file = new File("user.dat");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s; String []a;
            while (true){
                s = br.readLine();
                if(s == null ) break;
                a = s.split(";");
                if (acc.getUsername().equals(a[0]) && acc.getPassword().equals(a[1])) {
                    System.err.println("Login successfully");
                    return acc;
                }
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e){
            System.err.println("Can't read file");
        }
        return null;
    }
}
