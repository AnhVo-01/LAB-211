public class Employee {
    String Id;
    String FirstName, LastName;
    int Phone;
    String Email;
    String Address;
    String DOB; 
    String Sex; 
    double Salary;
    String Egency;

    public Employee(String Id, String FirstName, String LastName, int Phone, String Email, String Address, String DOB, String Sex, double Salary, String Egency) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.DOB = DOB;
        this.Sex = Sex;
        this.Salary = Salary;
        this.Egency = Egency;
    }

    public String getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public String getDOB() {
        return DOB;
    }

    public String getSex() {
        return Sex;
    }

    public double getSalary() {
        return Salary;
    }

    public String getEgency() {
        return Egency;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setEgency(String Egency) {
        this.Egency = Egency;
    }
    
    
}
