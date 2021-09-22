public class Doctor {
    String code;
    String name;
    String specialization;
    int avail;

    public Doctor() {
    }
    
    public Doctor(String code, String name, String specialization, int avail) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.avail = avail;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}
