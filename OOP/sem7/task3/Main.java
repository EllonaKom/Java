package OOP.sem7.task3;

// Adapter (Адаптер):
// Задание: Интеграция старой библиотеки с новой системой
// Вам нужно разработать адаптер для интеграции старой библиотеки 
// c новой системой.
// Создайте интерфейс Document, который определяет методы для открытия
//  и закрытия документа.
// Реализуйте класс OldDocument, представляющий старую библиотеку для 
// работы с документами, и имеющий методы openDocument() и closeDocument().
// Создайте адаптер DocumentAdapter, который адаптирует класс OldDocument 
// к интерфейсу Document, реализуя методы open() и close().
// Напишите клиентский код, который будет использовать адаптер для открытия
//  и закрытия документов в новой системе.

public class Main {

    public static void main(String[] args) {
        OldDocument od = new OldDocument();
        DocumentAdapter da = new DocumentAdapter(od);

        da.open();
        da.close();
    }

}