package OOP.dom5.View;
import java.util.ArrayList;
import OOP.dom5.Data.Student;

public class StudentView {
    public StudentView ( ){
        
    }
  
    public void stuCheck(ArrayList<Student> students, int id){
        for (Student student: students) {
           if (student.getId() == id)
           System.out.println(student);
        }
    }
    
}