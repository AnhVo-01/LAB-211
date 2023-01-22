
// https://docs.google.com/document/d/1qNeYZ_C6WlTpXLMckboxpHWP5T8W5MFZ/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class MainP0021 {
    public static void main(String[] args) {
        View v = new View();
        while(true){
            int choice = v.menu();
            switch (choice) {
                case 1: v.createStudent();       
                    break;
                case 2: v.FindandSort();
                    break;
                case 3: v.updateOrdelete();           
                    break;
                case 4: v.searchStudent();                   
                    break;
                case 5:
                    return;
            }
        }
    }
}
