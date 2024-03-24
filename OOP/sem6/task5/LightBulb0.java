package OOP.sem6.task5;

class LightBulb {
    public void turnOn() {
    // Включение лампочки
    }
    
    public void turnOff() {
    // Выключение лампочки
    }
    }
    
    class Switch {
    private LightBulb bulb;
    
    public Switch() {
    this.bulb = new LightBulb();
    }
    
    public void operate() {
    // Работа с выключателем
    bulb.turnOn();
    }
    }
    // Роман Сухачев Здесь класс Switch жестко зависит от класса LightBulb,
    //  нарушая DIP. Чтобы следовать DIP, зависимость должна быть инвертирована 
    //  с использованием интерфейсов или абстракций.
    
    // Эти примеры демонстрируют нарушение каждого из принципов SOLID на языке Java.
    //  Чтобы улучшить код, следует рассмотреть возможности его рефакторинга, чтобы 
    //  соответствовать этим принципам.