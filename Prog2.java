import java.util.Scanner;

public class Prog2 {
    // Задание №1
    // Написать программу, которая запросит пользователя ввести
    // <Имя> в консоли.
    // Получит введенную строку и выведет в консоль сообщение
    // “Привет, <Имя>!” 
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in,"ibm866"); // входной поток
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.err.println("Привет, "+ name );
       scanner.close();
    }
}
