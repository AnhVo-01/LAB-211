
import java.util.ArrayList;
import java.util.Comparator;

public class Controllers {
    private ArrayList<Employee> em = new ArrayList<>();
    
    // addEmployees
    public void add(Employee e){
        em.add(new Employee(e.getId(), e.getFirstName(), e.getLastName(), 
                            e.getPhone(),e.getEmail(),e.getAddress(), e.getDOB(), 
                            e.getSex(), e.getSalary(), e.getEgency()));
    }
    
    // UpdateEmployees
    public void update(String id, String firstName, String lastName, int phone, String email, String address, String dob, String sex, double salary, String agency){
        Employee em = findById(id);
        if (!"".equals(firstName)) {
            em.setFirstName(firstName);
        }
        if (!"".equals(lastName)) {
            em.setLastName(lastName);
        }
        if (!"".equals(address)) {
            em.setAddress(address);
        }
        if (!"".equals(agency)) {
            em.setEgency(agency);
        }
        if (!"".equals(email)) {
            em.setEmail(email);
        }
        if (phone != 0) {
            em.setPhone(phone);
        }
        if (!"".equals(dob)) {
            em.setDOB(dob);
        }
        if (salary != 0) {
            em.setSalary(salary);
        }
        if (!"".equals(sex)) {
            em.setSex(sex);
        }
    }
    
    // Delete employee
    public boolean Delete(Employee e){     
        return em.remove(e);
    }
    
    // Search by name
    public ArrayList<Employee> Search (String info){
        if ("".equals(info)) {
            return em;
        } else {
            ArrayList<Employee> ListSearch = new ArrayList<>();
            for (Employee employee : em) {
                String fname = employee.getFirstName();
                String lname = employee.getLastName();
                String id = employee.getId();
                if (fname.toUpperCase().contains(info.toUpperCase())) {
                    ListSearch.add(employee);
                }
                if (lname.toUpperCase().contains(info.toUpperCase())) {
                    ListSearch.add(employee);
                }
                if (id.toUpperCase().contains(info.toUpperCase())){
                    ListSearch.add(employee);
                }
            }
            return ListSearch;
        }
    }
    
    //sortEmployeeBySalary
    public ArrayList<Employee> sortEmployeeBySalary() {
        em.sort(Comparator.comparing(Employee::getSalary));
        return em;
    }
    
    public Employee findById(String id){
        for (Employee emp : em) {
            if (emp.getId().equalsIgnoreCase(id)){
                return emp;
            }
        }
        return null;
    }
    
}
