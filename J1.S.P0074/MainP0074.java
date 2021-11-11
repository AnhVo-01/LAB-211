
// https://docs.google.com/document/d/1SKvlrJgEqwUlofUGAlbH6dDHrfaQ8OrP/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class MainP0074 {
    public static void main(String[] args) {
        Manage mn = new Manage();
        while (true) {
            int choice = mn.menu();
            switch (choice) {
            //add-----------------------------------------------------  
                case 1:
                    mn.additionMatrix();
                    break;
            //sub-----------------------------------------------------  
                case 2:
                    mn.subtractionMatrix();
                    break;
//          //mul---------------------------------------------------------
                case 3:
                    mn.multiplicationMatrix();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
