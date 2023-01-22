
// https://docs.google.com/document/d/1CM3tEwioYgqPaSx7ul4vAME7znlV4zqT/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=

public class MainP0101 {
    public static void main(String[] args) {
        View v = new View();
        
        while(true){
            int choice = v.menu();
            switch (choice) {
                case 1:
                    v.addEmployees();
                    break;
                case 2:
                    v.UpdateEmployees();
                    break;
                case 3:
                    v.RemoveEmployees();
                    break;
                case 4:
                    v.searchEmployees();
                    break;
                case 5:
                    v.sortEmployees();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
