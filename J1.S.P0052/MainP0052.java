
// https://docs.google.com/document/d/1rMs5BPdaaPRBRYmhyCB9JW0v4a58Cz8C/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class MainP0052 {
    public static void main(String[] args) {
        ManageEastAsiaCountries mn = new ManageEastAsiaCountries();
        
        while(true){
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.add();
                    break;
                case 2:
                    mn.Display();
                    break;
                case 3:
                    mn.search();
                    break;
                case 4:
                    mn.sort();
                    break;
                case 5:
                    return;
            }
        }
    }
}
