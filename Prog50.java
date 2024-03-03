
// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Prog50 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new TreeMap<>();
        hashMap.put(123456, "Иванов");
        hashMap.put(321456, "Васильев");
        hashMap.put(234561, "Петрова");
        hashMap.put(234432, "Иванов");
        hashMap.put(654321, "Петрова");
        hashMap.put(345678, "Иванов");

        String targetName = "Иванов";
        System.out.println("Данные по сотрудникам с фамилией " + targetName);
        System.out.println();

        for (int passpotNum : hashMap.keySet()) {
            String name = hashMap.get(passpotNum);
            if (name.equals(targetName)) {
                System.out.println("Номеp паспорта: " + passpotNum + ", Фамилия: " + name);
            }
        }
    }
}
