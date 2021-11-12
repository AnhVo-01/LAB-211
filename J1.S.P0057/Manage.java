public class Manage {
    Controlles ctr = new Controlles();
    public int menu(){
        System.out.println("====== USER MANAGEMENT SYSTEM ======");
        System.out.print("1. Create a new account\n"+
                         "2. Login system\n"+
                         "3. Exit\n");
        System.out.print("> Choose: ");
        int choice = Validation.checkInputIntLimit(1, 3);
        return choice;
    }
    
    public void addUser() throws Exception{
        if (!Validation.checkFileExist()) {
            return;
        }
        System.out.println("\n---------- Create Account ----------");
        String username = Validation.checkUserName();
        while(!Validation.checkUsernameExist(username)){
            System.err.println("Username exist.");
            username = Validation.checkUserName();
        }
        String password = Validation.checkInputPassword();     
        ctr.addAccount(new Account(username, password));
        System.out.println("Create successly!");
        System.out.println("------------------------------------\n");
    }
    
    public void Login() throws Exception{
        if (!Validation.checkFileExist()) {
            return;
        }    
        System.out.println("\n-------------- Login --------------");
        String username = Validation.checkUserName();
        String password = Validation.checkInputPassword();         
 
        while(ctr.find(new Account(username,password))==null){
            System.err.println("Invalid user name or password");  
            username = Validation.checkUserName();
            password = Validation.checkInputPassword();
        }
        System.out.println("-----------------------------------\n");
    }
}
