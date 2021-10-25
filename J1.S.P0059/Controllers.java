
import java.io.*;
import java.util.*;

public class Controllers {
    private List<Person> list = new ArrayList<>();
    
    public List<Person> getPerson(String path, double money) throws Exception{
        try{
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            String s; String []a;
            String xName; String xAddress; double xSalary;
            while(true) {
                s = br.readLine();
                if(s == null ) break;
                a = s.split(";");
                xName = a[0].trim();
                xAddress = a[1].trim();
                try {
                    xSalary = Double.parseDouble(a[2].trim());
                } catch (NumberFormatException e) {
                    xSalary = 0;
                }
                if(xSalary >= money){
                    list.add(new Person(xName,xAddress,xSalary));
                }
            }
            fr.close();
            br.close();
        }catch (FileNotFoundException e) {
            System.err.println("Can't read file.");
        }
        list.sort(Comparator.comparing(Person::getSalary));
        return list;
    }
    
    public static boolean copyWordOneTimes (String source, String destination) throws Exception{
        HashSet<String> content = new HashSet<>();
        // add from file
        File fileIn = new File(source);
        try {
            Scanner input = new Scanner(fileIn);
            while (input.hasNext()) {
                String next = input.next();
                content.add(next + " ");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Can’t read file");
        }
        
        //save to file
        try{
            FileWriter fw = new FileWriter(destination);
            PrintWriter pw = new PrintWriter(fw);
            for (String x : content){
                pw.write(x);
            }
            System.out.println("Copy done...");
            pw.close(); fw.close();
        }catch (IOException e) {
            System.err.println("Can’t write file");
        }
        return true;
    }
}
