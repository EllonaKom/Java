package OOP.sem6.task5;

class LightBulb implements Switchabl{
    public void turnOn() {
    // Включение лампочки
    }
    
    public void turnOff() {
    // Выключение лампочки
    }
    }
    
    interface Switchabl {
    public void turnOn();
    
    public void turnOff();
    }
    
    class Switch {
    private Switchabl bulb;
    
    public Switch(Switchabl device) {
    this.bulb = device;
    }
    
    public void operate() {
    // Работа с выключателем
    bulb.turnOn();
    }
    }