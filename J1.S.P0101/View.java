
import java.util.ArrayList;

public class View {
    Controllers ctr = new Controllers();
    public int menu(){
        System.out.println("========Employee Mamagement========");
        System.out.print("  1. Add employees\n" +
                         "  2. Update employees\n" +
                         "  3. Remove employees\n" +
                         "  4. Search employees\n" +
                         "  5. Sort employees by salary\n" +
                         "  6. Exit\n\n" +
                         "Enter your choice: ");
        int choice = Validate.inputIntLimit(1, 6);
        return choice;
    }
    
    public void addEmployees() {
        System.out.println("\n-------- Add Employees --------");
        String id = Validate.inputString("Enter ID: ","Invalid!","[0-9A-Za-z]+");
        
        if (ctr.findById(id)!=null){
            System.err.println("This code is duplicate");
            return;
        }
        
        String fname = Validate.inputString("First Name: ",
                "First name is required!", "[a-zA-Z ]+");
        String lname = Validate.inputString("Last Name: ",
                "First name is required!", "[a-zA-Z ]+");
        System.out.print("Phone: ");
        int phone = Validate.inputPhone();
        String email = Validate.inputString("Email: ",
                "Invalid is Email!", "^[0-9A-Za-z+_.%]+@[0-9A-Za-z.-]+.[A-Za-z]{2,4}$");
        String addr = Validate.inputString("Address: ",
                "Adress is required!", "[0-9A-Za-z+_., ]+");
        String dob = Validate.inputDate("DOB [dd/MM/yyyy]: ", "Invalid format!", "dd/MM/yyyy");
        String sex = Validate.inputString("Sex [M/F]: ", "Invalid!", "[a-zA-Z ]+");
        double salary = Validate.inputDouble("Salary: ", "Invalid salary!");
        String egency = Validate.inputString("Egency: ", "invalid!", "[0-9a-zA-Z ]+");
        
        ctr.add(new Employee(id, fname, lname, phone, email, addr, dob, sex, salary, egency));
        System.err.println("Successfully!");
        System.out.println();
    }
    
    public void UpdateEmployees() {
        System.out.println("\n-------- Update Employee --------");
        String id = Validate.inputString("Enter ID: ","Invalid!","[0-9A-Za-z]+");
        Employee em = ctr.findById(id);
        if (em == null){
            System.err.println("Not found employee!");
            return;
        }      
        
        String fname = Validate.inputString("First Name: ",
                "First name is required!", "[a-zA-Z ]+");
        String lname = Validate.inputString("Last Name: ",
                "First name is required!", "[a-zA-Z ]+");
        System.out.print("Phone: ");
        int phone = Validate.inputPhone();
        String email = Validate.inputString("Email: ",
                "Invalid is Email!", "^[0-9A-Za-z+_.%]+@[0-9A-Za-z.-]+\\.[A-Za-z]{2,4}$");
        String addr = Validate.inputString("Address: ",
                "Adress is required!", "[0-9A-Za-z+_., ]+");
        String dob = Validate.inputDate("DOB [dd/MM/yyyy]: ", "Invalid format!", "dd/MM/yyyy");
        String sex = Validate.inputString("Sex [M/F]: ", "Invalid!", "[a-zA-Z ]+");
        double salary = Validate.inputDouble("Salary: ", "Invalid salary!");
        String egency = Validate.inputString("Egency: ", "invalid!", "[0-9a-zA-Z ]+");
        
        // check info has changed or no
        if (!Validate.checkChangeInfo(em, id, fname, lname, phone, email, addr, dob, sex, salary, egency)){
            System.err.println("No change");
            return;
        }
        ctr.update(id, fname, lname, phone, email, addr, dob, sex, salary, egency);
        System.err.println("Update successful!\n");
        System.out.println();
    }
    
    public void RemoveEmployees() {
        // find employee by id then delete
        System.out.println("\n-------- Remove Employee --------");
        String id = Validate.inputString("Enter ID: ","Invalid!","[0-9A-Za-z]+");
        
        if (ctr.findById(id) == null){
            System.err.println("Not found employee!");
            return;
        } else {
            // make sure users are sure of their choice
            System.out.println("All info associated with this ID will be removed from the system!!!");
            System.out.print("Do you want to continue (Y/N): ");
            if (Validate.checkInputYN()) {
                ctr.Delete(ctr.findById(id));
            }else{
                return;
            }       
        }
        System.err.println("Delete successful.");
        System.out.println();
    }
    
    // search employee by name (name or apart of name)
    public void searchEmployees() {
        System.out.println("\n-------- Search Employee --------");
        String value = Validate.inputSearchValue("Enter name: ");      
        ArrayList<Employee> ListSearch = ctr.Search(value);
        if (ListSearch.isEmpty()) {
            System.err.println("List empty.");
        }else{
            System.out.println("---------------- Result ----------------");
            printInfor(ListSearch);
        } 
    }
    
    // sort employee by salary
    public void sortEmployees() {
        ArrayList<Employee> listEmployee = ctr.sortEmployeeBySalary();
        System.out.println("-------- Sort employees --------");
        printInfor(listEmployee);
    }  
    
    // printInfor
    public void printInfor(ArrayList<Employee> listEmployee){
        System.out.printf("\n%-5s%-15s%-15s%-15s%-25s%-26s%-12s%-10s%-10s%-10s\n",
                "ID", "First Name", "Last Name", "Phone", "Email", "Adress", "DOB",
                "Sex", "Salary", "Egency");
        for (Employee emp : listEmployee) {
            System.out.printf("%-5s%-15s%-15s%-15s%-25s%-26s%-12s%-10s%-10.1f%-10s\n",
                    emp.getId(),
                    emp.getFirstName(),
                    emp.getLastName(),
                    emp.getPhone(),
                    emp.getEmail(),
                    emp.getAddress(),
                    emp.getDOB(),
                    emp.getSex(),
                    emp.getSalary(),
                    emp.getEgency()
            );
        }
        System.out.println();
    }
}
