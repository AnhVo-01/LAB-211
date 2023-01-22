
import java.util.ArrayList;

public class View {
    Controllers ctr = new Controllers();
    public int menu(){    
        System.out.println("--- WELLCOME TO STUDENT MANAGEMENT ---");
        System.out.print("      1. Create\n" +
                         "      2. Find and Sort.\n" +
                         "      3. Update/Delete\n" +
                         "      4. Report.\n" +
                         "      5. Exit.\n\n"+
                         "Enter your choice: ");
        int tc = Validate.checkInputIntLimit(1, 5);
        return tc;
    }
    public void createStudent(){
        int count=0;
        System.out.println("--------- Create Student ---------");
        while (true) {
            System.out.print("Enter ID: ");
            String id = Validate.checkInputString();
            
            Students student = ctr.findById(id);
        
            if (student != null) {
                System.err.println("Id has exist student. Please re-input!");
                continue;
            } 

            System.out.print("Enter name student: ");
            String name = Validate.checkInputString();  
            System.out.print("Enter semester: ");
            String semester = Validate.checkInputString();
            String course = Validate.checkInputCourse("Enter name course: ");
            ctr.create(new Students(id, name, semester, course));
            count++;
            System.err.println("Successfully!\n");
            
            if (count >= 1) {
            System.out.print("Do you want to continue (Y/N): ");
                if (!Validate.checkInputYN()) {
                    return;
                }
            }
                
//            //check student exist or not
//            if (Validate.checkStudentExist(student, id, name, semester, course)){
//                ctr.create(new Students(id, name, semester, course));
//                count++;
//                System.err.println("Successfully!");
//                return;
//            }      
        }      
    }
    
    public void FindandSort(){
        System.out.println("-------- Find and Sort --------");
        System.out.print("Enter Name: ");
        String name = Validate.checkInputString();
        ctr.Search(name);
        System.out.println("-------- Result --------");
        ArrayList<Students> ListSearch = ctr.sortByName();
        if (ListSearch.isEmpty()) {
            System.err.println("List empty.");
        }else{
            System.out.printf("%-26s%-10s%-15s\n", "Student Name", "Semester", "Course Name");
            for (Students stu : ListSearch) {
                System.out.printf("%-26s%-10s%-15s\n", stu.getStudentName(), stu.getSemester(), stu.getCourseName());
            }
        }
        System.out.println();
    }
    
    public void updateOrdelete(){
        while(true){
            System.out.print("Enter ID: ");
            String id = Validate.checkInputString();
            Students student = ctr.findById(id);
        
            if (student == null){
                System.err.println("Not found!");
                continue;
            }
            
            System.out.print("Do you want to update (U) or delete (D) student? ");
//            String choice = Validate.checkInputString();
            if (Validate.checkInputUD()){
                ctr.delete(student);
                System.err.println("Delete successful.\n");
            }else{
                System.err.println("");
            }
            
            System.out.println();
        }
    }
     
    public void searchStudent(){
        
    }
}
