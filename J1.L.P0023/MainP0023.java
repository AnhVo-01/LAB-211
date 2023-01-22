
// https://docs.google.com/document/d/1U38XhNi7AyZk5oCQsSj1iWkCmpyJ8mUL/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class MainP0023 {
    public static void main(String[] args) {
        Manage mn = new Manage();
        
        while(true){
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.createFruit();
                    break;
                case 2:
                    mn.deleteTask();
                    break;
                case 3:
                    mn.getDataTasks();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
