
// https://docs.google.com/document/d/1sjWEJkloUribDBTJp331rk32cDFKxADX/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class MainP0011 {
    public static void main(String[] args) {
        Manage mn = new Manage();
        while (true) {
            int choice = mn.menu();
            if (choice == 4){
                System.out.println("\nEXITING THE PROGRAM . . .\n");
                System.exit(0);
                break;
            }
            int choice1 = mn.input();
            switch (choice) {
            //Converse from Bin-----------------------------------------------------  
                case 1:
                    if (choice1 == 1) {
                        System.err.println("Error!!!");
                        break;
                    }
                    switch (choice1) {
                        case 2:
                            mn.BINtoDEC();
                            break;
                        case 3:
                            mn.BINtoHEX();
                            break;
                    }
                    break;
            //Converse from DEC-----------------------------------------------------  
                case 2:
                    if (choice1 == 2) {
                        System.err.println("Error!!!");
                        break;
                    }
                    switch (choice1) {
                        case 1:
                            mn.DECtoBIN();
                            break;
                        case 3:
                            mn.DECtoHEX();
                            break;
                    }
                    break;
//          //Converse from HEX---------------------------------------------------------
                case 3:
                    if (choice1 == 3) {
                        System.err.println("Error!!!");
                        break;
                    }
                    switch (choice1) {
                        case 1:
                            mn.HEXtoBIN();
                            break;
                        case 2:
                            mn.HEXtoDEC();
                            break;
                    }
                    break;
            }
        }
    } 
}
