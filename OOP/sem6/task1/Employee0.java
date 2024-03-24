package OOP.sem6.task1;
 //  В этом примере класс Employee нарушает SRP,
    //  так как он содержит методы как для вычисления заработной платы, 
    //  так и для сохранения данных в базу данных. Это делает класс менее 
    //  поддерживаемым и 
    // усложняет его изменение.
class Employee {
    private String name;
    private double salary;
    
    public void calculateSalary() {
    // Подсчет заработной платы
    }
    
    public void saveEmployee() {
    // Сохранение данных сотрудника в базу данных
    }
    }
   


    

