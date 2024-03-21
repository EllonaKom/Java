package OOP.dom3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    public List<Stream> sortStreamsByGroupSize(List<Stream> streams) {
        List<Stream> streamList = new ArrayList<>(streams);
        Collections.sort(streamList, new StreamComparator());
        return streamList;
    }
    // public List<Stream> getSortStreams(){
    //     //     List<Stream> sList = new ArrayList<>(getSortStreams());
    //     //     sList.sort(new StreamComparator());
    //     }


    //     // public List<Student> getSortedStudentGroupByFIO() { // сортирует по описанному методу сортировки по ФИО
    //     //     List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
    //     //     studentList.sort(new StudentComparator());
    //     //     return studentList;
    
}