package OOP.dom5.Service;
import java.util.ArrayList;
import java.util.List;

import OOP.dom5.Data.Student;
import OOP.dom5.Data.Teacher;
import OOP.dom5.Data.User;
//import OOP.dom5.Data.Group;
import OOP.dom5.View.StudentView;
import OOP.dom5.Service.DataService;

public class DataService {

private ArrayList<Teacher> teachers;
private ArrayList<Student> students;
private ArrayList<StudentView>studentView;

public DataService() {
this.teachers = new ArrayList<>();
this.students = new ArrayList<>();
this.studentView = new ArrayList<>();

}

public void create(User user) {
if (user instanceof Student) {
int id = students.size();
Student student = new Student(user.getName(), user.getAge());
student.setId(id + 1);
students.add(student);
} else if (user instanceof Teacher) {
Teacher teacher = new Teacher(user.getName(), user.getAge(), List.of("Math", "Phisics"));
teachers.add(teacher);
}

}

public void read(boolean bool) { // true student
if (bool) {
System.out.println(students);
} else if (!bool) {
System.out.println(teachers);
}
}

public void  id(int id){
    studentView.stuCheck(students,id);
}
}


// package OOP.dom5.Service;
// import java.util.ArrayList;
// import java.util.List;

// import OOP.dom5.Data.Student;
// import OOP.dom5.Data.Teacher;
// import OOP.dom5.Data.User;
// //import OOP.dom5.Data.Group;


// public class DataService {

// private ArrayList<Teacher> teachers;
// private ArrayList<Student> students;

// public DataService() {
// this.teachers = new ArrayList<>();
// this.students = new ArrayList<>();
// }

// public void create(User user) {
// if (user instanceof Student) {
// int id = students.size();
// Student student = new Student(user.getName(), user.getAge());
// student.setId(id + 1);
// students.add(student);
// } else if (user instanceof Teacher) {
// Teacher teacher = new Teacher(user.getName(), user.getAge(), List.of("Math", "Phisics"));
// teachers.add(teacher);
// }

// }

// public void read(boolean bool) { // true student
// if (bool) {
// System.out.println(students);
// } else if (!bool) {
// System.out.println(teachers);
// }
// }
// }
