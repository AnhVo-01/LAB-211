
// https://docs.google.com/document/d/1Ty3LTtiP5p4KUW0fRQYne3Y5JXldAgxb/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class mainP0057 {
    public static void main(String[] args) throws Exception {
        Manage mn = new Manage();
        while(true){
            int choice = mn.menu();
            switch (choice) {
                case 1: mn.addUser();       
                    break;
                case 2: mn.Login();
                    break;
                case 3:
                    return;
            }
        }
    }   
}
