package OOP.sem6.task4;

interface Worker {
    void work();
    void eat();
    }
    
    class Engineer implements Worker {
    public void work() {
    // Реализация работы инженера
    }
    
    public void eat() {
    // Реализация приема пищи
    }
    }
    // Роман Сухачев Здесь Engineer вынужден реализовывать метод eat(),
    //  хотя он ему не нужен. ISP нарушается, так как интерфейс Worker 
    //  должен быть разделен на более мелкие интерфейсы, чтобы избежать 
    //  "жирных" интерфейсов.