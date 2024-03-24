package OOP.dom5.Data;


import java.util.ArrayList;
import java.util.List;

public class Teacher extends User{
private ArrayList<String> disciplines;

public Teacher(String name, int age, List<String> of) {
    //TODO Auto-generated constructor stub
}

public ArrayList<String> getDisciplines() {
return disciplines;
}

public void setDisciplines(ArrayList<String> disciplines) {
this.disciplines = disciplines;
}
}