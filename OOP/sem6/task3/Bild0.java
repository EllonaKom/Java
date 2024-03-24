package OOP.sem6.task3;

class Bird0 {
    public void fly() {
    // Реализация полета птицы
    }
    }
    
    class Ostrich extends Bird0 {
    public void fly() {
    throw new UnsupportedOperationException("Страус не умеет летать");
    }
    }
    // Роман Сухачев В данном случае, нарушается LSP, так как наследующий класс 
    // Ostrich изменяет ожидаемое поведение метода fly() базового класса Bird.