
import java.util.ArrayList;
import java.util.Comparator;

public class Controllers {
    private ArrayList<Students> st = new ArrayList<>();
    
    public void create(Students x){
        st.add(new Students(x.getId(), x.getStudentName(), x.getSemester(), x.getCourseName()));
    }
    
    public void update(String id, String studentName, String semester, String courseName){
        if (!"".equals(studentName)) {
            findById(id).setStudentName(studentName);
        }
        if (!"".equals(semester)) {
            findById(id).setSemester(semester);
        }
        if (!"".equals(courseName)) {
            findById(id).setCourseName(courseName);
        }
    }
    
    public boolean delete(Students x){
        return st.remove(x);
    }
    
    public ArrayList<Students> Search (String infor){
        ArrayList<Students> List = new ArrayList<>();
        
        return List;
    }
    public Students findById(String id){
        for (Students stu : st) {
            if (stu.getId().equalsIgnoreCase(id)){
                return stu;
            }
        }
        return null;
    }
    
    public ArrayList<Students> sortByName() {
        st.sort(Comparator.comparing(Students::getStudentName));
        return st;
    }
}
