package OOP.sem6.task1;

import java.util.ArrayList;

public class ListEmployee {
ArrayList<Employee> EmployeeList = new ArrayList<>();

public void saveEmployee(Employee employee) {
EmployeeList.add(employee);
}
}