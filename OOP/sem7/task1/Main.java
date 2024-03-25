package OOP.sem7.task1;

//  currentDateTime = LocalDateTime.now();

// // Форматируем дату и время в удобочитаемую строку
// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
// String formattedDateTime = currentDateTime.format(formatter);

// // Выводим отформатированную дату и время
// System.out.println("Текущая дата и время: " + formattedDateTime);
// Роман Сухачев LocalDateTime.now();
 /*
* Вам нужно разработать декоратор для добавления дополнительной информации к текстовому сообщению.

Создайте интерфейс Message, который определяет методы для отправки и получения текстового сообщения.

Реализуйте класс TextMessage, представляющий базовое текстовое сообщение.

Создайте декоратор MessageDecorator, который будет добавлять дополнительную информацию к текстовому сообщению (например, дату отправки).

Напишите клиентский код, который будет использовать декоратор для отправки и получения текстовых сообщений с дополнительной информацией.
*/
public class Main {
public static void main(String[] args) {

TextMessage tm = new TextMessage();

tm.setMessage("Hello world");
MessageDecorator ms = new MessageDecorator(tm);

tm.sendMess();
ms.sendMess();
}
}


