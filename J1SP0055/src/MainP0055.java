

// https://docs.google.com/document/d/1JpwKwLJATKaMds3KVXzNDXE-qMGt618k/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class MainP0055 {
    public static void main(String[] args) {
        Manager mn = new Manager();
        while (true) {
            int choice = mn.menu();
            switch (choice) {
                case 1:
                    mn.addDoctor();
                    break;
                case 2:
                    mn.updateDoctor();
                    break;
                case 3:
                    mn.deleteDoctor();
                    break;
                case 4:
                    mn.searchDoctor();
                    break;
                case 5:
                    return;
            }
        }
    }
}
