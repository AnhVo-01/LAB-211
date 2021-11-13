
// https://docs.google.com/document/d/1hu9nfq-AUWQGolxdYsNPHZLX7iYvb684/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class MainP0070 {

    public static void main(String[] args)  {
        Manages mn = new Manages();
        while(true){
            int choice = mn.Menu();
            switch(choice){
                case 1:
                    mn.Vietnamese();
                    break;
                case 2:
                    mn.English();
                    break;
                case 3:
                    System.exit(0);
                    return;
            }
        }
    }
}
