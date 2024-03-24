package OOP.sem6.task2;

class Rectangle {
    public double width;
    public double height;
    }
    
    class AreaCalculator {
    public double calculateArea(Rectangle rectangle) {
    return rectangle.width * rectangle.height;
    }
    }
    // Роман Сухачев В этом примере, чтобы добавить поддержку других фигур,
    //  придется изменять класс AreaCalculator. Это нарушает OCP, так как класс
    //   не открыт для расширения и закрыт для изменения.