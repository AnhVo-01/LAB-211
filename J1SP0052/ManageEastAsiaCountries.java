
import java.util.ArrayList;

public class ManageEastAsiaCountries {
    Controllers ctr = new Controllers();
    public int menu(){
        System.out.println("                             MENU");
        System.out.println("===================================================================");
        System.out.print("  1. Enter the information for 11 countries in Southeast Asia.\n" +
                         "  2. Display already information.\n" +
                         "  3. Search the country according to the entered country's name.\n" +
                         "  4. Display the information increasing with the country name.\n" +
                         "  5. Exit\n");
        System.out.println("===================================================================");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 5);
        return choice;
    }
    
    public void add(){
        System.out.println("\n----------------------------");
        System.out.print("Enter code of country: ");
        String Code = Validation.checkInputString();
        //check code contry exist or not
        if (ctr.findByCode(Code)!=null){
            System.err.println("Country exist.");
            return;
        }
        System.out.print("Enter name of country: ");
        String Name = Validation.checkInputString();
        System.out.print("Enter total Area: ");
        float totalArea = Validation.checkInputArea(1, Float.MAX_VALUE);
        System.out.print("Enter terrain of country: ");
        String Terrain = Validation.checkInputString();
        ctr.add(new EastAsiaCountries(Code, Name, totalArea, Terrain));
        System.err.println("Successfully!");
        System.out.println();
    }
    
    public void Display(){
//        ArrayList<EastAsiaCountries> list = ctr.DisplayCountry();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        Country temp = ctr.DisplayCountry();
        temp.display();
        //Display information of countries you’ve just input
//        if (!list.isEmpty()) {
//            Country country = list.get(list.size()-1);
//            country.display();
//        }
//        // print all of the list
//        for (Country country : list) {
//            country.display();
//        }
    }
    
    public void search(){
        System.out.println("\n----------------------------");
        System.out.println("Enter the name you want to search for:");
        String value = Validation.checkInputString();      
        ArrayList<EastAsiaCountries> listSearch = ctr.Search(value);
        if (listSearch.isEmpty()) {
            System.err.println("List empty.");
        }else{
            System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
            for (Country country : listSearch) {
                country.display();
            }
        } 
    }
    
    public void sort(){
        ArrayList<EastAsiaCountries> listSort = ctr.sortByName();
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : listSort) {
            if (listSort.isEmpty()) {
                System.err.println("List empty.");
            }else{
                country.display();
            }
        }
    }
}
