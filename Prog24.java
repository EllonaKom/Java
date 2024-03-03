// Задание №4
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;
public class Prog24 {
    public static void main(String[] args) {
        String word = "TEST";
        int count = 100;
        String str = repeatWord(word, count);
        writeToFile(str, "Name.txt");

    }

    public static String repeatWord(String word, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word).append(" ");

        }
        return result.toString();
    }

    public static void writeToFile(String str, String fileName) {
        // try {
        // FileWriter fileWriter = new FileWriter(fileName);
        // fileWriter.write(str);
        // fileWriter.close();

        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println("Ошибка записи файла!");
        // System.out.println(e.toString());
        // }

        // finally {

        // }
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(str);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Ошибка записи файла!");
            System.out.println(e.toString());
        }
    }

}