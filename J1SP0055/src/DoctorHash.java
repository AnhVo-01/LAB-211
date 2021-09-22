
import java.util.ArrayList;

public class DoctorHash {
    private ArrayList<Doctor> dr = new ArrayList<>();
    
    public void AddDoctor(Doctor x){
        dr.add(new Doctor(x.getCode(), x.getName(), x.getSpecialization(), x.getAvail()));
    }
    
    public void update(String code, String name, String specialization, int avail){
        Doctor doctor = findById(code);
        if (!"".equals(name)) {
            doctor.setName(name);
        }
        if (!"".equals(specialization)) {
            doctor.setSpecialization(specialization);
        }
        if (!"".equals(avail)) {
            doctor.setAvail(avail);
        }
    }
    
    public boolean Delete(Doctor id){     
        return dr.remove(id);
    }
    
    public Doctor findById(String id){
        for (Doctor dr1 : dr) {
            if (dr1.getCode().equalsIgnoreCase(id)){
                return dr1;
            }
        }
        return null;
    }
    
    public ArrayList<Doctor> Search (String infor){
        
            ArrayList<Doctor> ListSearch = new ArrayList<>();
            for (Doctor doctor : dr) {
                String name = doctor.getName();
                String spec = doctor.getSpecialization();
                int avail = doctor.getAvail();
                if (name.toUpperCase().contains(infor.toUpperCase())) {
                    ListSearch.add(doctor);
                }
                if (spec.toUpperCase().contains(infor.toUpperCase())){
                    ListSearch.add(doctor);
                }
           
            }
            return ListSearch;
        
    }
}
