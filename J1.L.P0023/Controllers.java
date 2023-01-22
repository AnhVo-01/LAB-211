
import java.io.*;
import java.util.ArrayList;
import java.util.Hashtable;

class Controllers {
    private ArrayList<Fruit> lf = new ArrayList<>();
    
    public void createFruit(Fruit x){
        lf.add(new Fruit(x.getFruitID(), x.getFruitName(), x.getPrice(), x.getQuantity(), x.getOrigin()));
        try{
            File f = new File("Fruit.txt");
            FileWriter fw = new FileWriter(f,true);
            PrintWriter pw = new PrintWriter(fw);
            for (Fruit p : lf){
                pw.printf("%-4s |  %-15s |  %-5.2f |  %-5d |  %-15s\r\n",p.getFruitID(),
                                        p.getFruitName(),p.getPrice(),
                                        p.getQuantity(), p.getOrigin());
            }
            pw.close(); 
            fw.close();
        }catch (IOException e) {
            System.err.println("Can’t write file");
        }
    }
    public ArrayList<Fruit> display (){    
          return lf;      
    }
    public Fruit findByID(String code){
        for (Fruit c : lf) {
            if (c.getFruitID().equalsIgnoreCase(code)){
                return c;
            }
        }
        return null;
    }
}
