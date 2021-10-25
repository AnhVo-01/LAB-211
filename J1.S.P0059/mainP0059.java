
//https://docs.google.com/document/d/1GZIJrjOpl73fR2wPnrVOOwerhy0zFC3g/edit?usp=sharing&ouid=110793312897923387934&rtpof=true&sd=true

public class mainP0059 {
 
    public static void main(String[] args) throws Exception{
        Manage mn = new Manage();
        while(true){
            int choice = mn.menu();
            switch (choice) {
                case 1: mn.findPersonInfo();       
                    break;
                case 2: mn.coppyNewFile();
                    break;
                case 3:
                    return;
            }
        }
    }
}
