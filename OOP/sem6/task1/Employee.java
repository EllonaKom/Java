package OOP.sem6.task1;

// В этом примере, чтобы добавить поддержку других фигур, придется изменять 
// класс AreaCalculator. Это нарушает OCP, так как класс не открыт для расширения 
// и закрыт для изменения.

class Employee {
private String name;

public Employee(String name, double salary) {
this.name = name;
this.salary = salary;
}

private double salary;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public double getSalary() {
return salary;
}

public void setSalary(double salary) {
this.salary = salary;
}

@Override
public String toString() {

return "Employee [name = " + this.name + "salary = " + this.salary + "]";
}
}