
import java.util.ArrayList;

public class Manager {  
    DoctorHash dh = new DoctorHash();

    public int menu(){
        System.out.println("========Doctor Mamagement========");
        System.out.print("    1. Add Doctor\n" +
                         "    2. Update Doctor.\n" +
                         "    3. Delete Doctor\n" +
                         "    4. Search Doctor.\n" +
                         "    5. Exit.\n\n"+
                         "Enter your choice: ");
        int tc = Validate.checkInputIntLimit(1, 5);
        return tc;                          
    }
    
    // Add
    public void addDoctor(){
        System.out.println("--------- Add Doctor ---------");
        System.out.print("Enter code: ");
        String code = Validate.checkInputString();
        
        if (dh.findById(code)!=null){
            System.err.println("This code is duplicate");
            return;
        }     
        
        System.out.print("Enter name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = Validate.checkInputString();
        System.out.print("Enter availability: ");
        int avail = Validate.checkInputInt();
        
        dh.AddDoctor(new Doctor(code, name, specialization, avail));
        System.err.println("Successfully!");   
        System.out.println();
    }
    
    // update
    public void updateDoctor() {
        System.out.println("--------- Update Doctor ---------");
        System.out.print("Enter code: ");
        String code = Validate.checkInputString();
        
        Doctor doctor = dh.findById(code);
        
        if (doctor == null) {
            System.err.println("Not found doctor.");
            return;
        }                
//        System.out.print("Enter codeUpdate: ");
//        String codeUpdate = Validate.checkInputString();
        System.out.print("Enter name: ");
        String name = Validate.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = Validate.checkInputString();
        System.out.print("Enter availability: ");
        int availability = Validate.checkInputInt();
        
        //check user change infomation or not
         if (!Validate.checkChangeInfo(doctor, code, name, specialization, availability)) {
            System.err.println("No change");
            return;
        }
        dh.update(code, name, specialization, availability);
        System.err.println("Update successful!\n");
    }
    
    public void deleteDoctor(){
        System.out.print("Enter code: ");
        String code = Validate.checkInputString();    
        if (dh.findById(code) == null) {
            System.err.println("Not found doctor.");
            return;
        } else {
            dh.Delete(dh.findById(code));
        }
        System.err.println("Delete successful.\n");
    }
    
    public void searchDoctor() {
        System.out.println("-------- Search Doctor --------");
        System.out.print("Enter text: ");
        String text = Validate.checkInputString();
        dh.Search(text);
        System.out.println("-------- Result --------");
        ArrayList<Doctor> ListSearch = dh.Search(text);
        if (ListSearch.isEmpty()) {
            System.err.println("List empty.");
        }else{
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name", "Specialization", "Availability");
            for (Doctor doc : ListSearch) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doc.getCode(), doc.getName(), doc.getSpecialization(),doc.getAvail());
            }
        }
        System.out.println();
    } 
}
