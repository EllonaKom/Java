package OOP.dom4;

import OOP.dom4.Library;
import OOP.dom4.LibraryCard;
import OOP.sem4.sem42.Order;

// Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке.
// Каждая книга должна содержать параметр типа T для ее названия.
// Создайте обобщенный класс LibraryCard<K, V>, который представляет
//библиотечную карточку для определенной книги. Каждая карточка должна
// содержать параметры типов K для номера карточки и V для информации о книге.
// Создайте класс Library, который будет представлять библиотеку. У этого класса 
//должны быть методы для добавления книг и выдачи библиотечных карточек.
// Добавьте метод для вывода информации о всех выданных книгах с их библиотечными
// карточками.

public class Main {
    public static void main(String[] args) {
        
        Library<String, Integer, String> library = new Library<>();
            
            library.addBook(new Book<>("Русские народные сказки"));
            library.addBook(new Book<>("Сказки народов мира"));
            
            LibraryCard<Integer, String> card1 = new LibraryCard<Integer, String>(1111);
            LibraryCard<Integer, String> card2 = new LibraryCard<Integer, String>(1112);
            card1.setListInfo("Автор: Народ.Год выпуска 2022 ");
            card2.setListInfo("Автор: Народ.Год выпуска 2011 ");
            library.createOrder(card1);
            library.createOrder(card2);
            
            System.out.println(library);
            }
            }