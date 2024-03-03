// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
// методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить
// параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
// условиям.

import java.util.Objects;

class Laptop {
    private String name;
    private String ram;
    private String hardDisk;
    private String operSystem;
    private String color;
    
    public Laptop(String name, String ram, String hardDisk, String operSystem, String color) {
        this.name = name;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operSystem = operSystem;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    
    public String getOperSystem() {
        return operSystem;
    }

    
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop [Ноутбук: " + name + ", ОЗУ: " + ram + ", Жесткий диск: " + hardDisk + ", Система: "
                + operSystem + ", Цвет: " + color + "]"+"\n";
    }

        @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return name.equals(laptop.name) && ram == laptop.ram && color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram, hardDisk, operSystem, color);
    }
  
    
    
}