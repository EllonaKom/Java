package OOP.dom5;
// 1. Создать package – data. Работу продолжаем в нем
// 2. Реализовать абстрактный класс User и его наследники
// Student и Teacher. Родитель имеет в себе общие данные 
// (пример: фио, год рождения и тд), а наследники собственные 
// параметры (какие, по выбору преподавателя – 
// Пример: studentId для Student, disciplesTaught для Teacher).
// 3. После этого проговорить со студентами важность снижения 
// дублирования кода и легкость управления структурой данных 
// (в том числе, создание необходимого числа корректных конструкторов) 
// и добавления новых сущностей путем наследования от абстрактного класса

import java.util.List;

import OOP.dom5.Data.Student;
import OOP.dom5.Data.Teacher;
import OOP.dom5.Service.DataService;
//import OOP.dom5.View.GroupView;
//import OOP.dom5.View.StudentView;
//import OOP.dom5.View.TeacherView;

public class Main {
public static void main(String[] args) {
DataService data = new DataService();

data.create(new Student("A", 15));
data.create(new Student("B", 15));
data.create(new Student("C", 15));
data.create(new Teacher("Teach1", 32, List.of("math")));
data.create(new Teacher("Teach2", 43, List.of("math", "phisics")));
data.create(new Teacher("Teach1", 32, List.of("math", "phisics", "astronomy")));
data.create(new Teacher("Teach3", 32, List.of("informatics", "astronomy")));

// data.read(true);
// System.out.println();
// data.read(false);
data.id(1);
}

 
        
}