
import java.util.List;

public class Manage {
    Controllers ctr = new Controllers();
    
    public int menu(){
        System.out.println("========== File Processing ==========");
        System.out.print("   1.   Find person info\n"+
                         "   2.   Copy Text to new file\n"+
                         "   3.   Exit\n");
        System.out.print("Enter choice: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }
    
    public void findPersonInfo() throws Exception{
        System.out.println("\n------------ Person Info ------------");
        String pathFile = Validation.checkInputPathFile();
        Double money = Validation.checkInputDouble();
        
        List<Person> lp = ctr.getPerson(pathFile, money);
        System.out.println("--------------- Result --------------");
        System.out.printf("%-15s%-15s%-15s\n", "Name", "Address", "Salary");
        for (Person person : lp) {
            System.out.printf("%-15s%-15s%-15.1f\n", person.getName(),
                    person.getAddress(), person.getSalary());
        }
        System.out.println();
        System.out.println("Max: " + lp.get(lp.size() - 1).getName());
        System.out.println("Min: " + lp.get(0).getName());       
    }
    
    public void coppyNewFile() throws Exception {
        System.out.println("\n------------- Copy text -------------");
        String pathFileInput = Validation.checkInputPathFile();
        System.out.print("Enter new file name: ");
        String pathFileOutput = Validation.checkInputString();
        ctr.copyWordOneTimes(pathFileInput, pathFileOutput);    
    }

}
