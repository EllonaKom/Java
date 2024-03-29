// Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на
// платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с
// количеством повторений. Отсортировать по убыванию популярности.
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Dom52 {
    public static void main(String[] args) {
        List<String> workers = List.of("Иван", "Пётр", "Пётр", "Антон", "Антон", "Иван", "Пётр", "Иван", "Пётр", "Иван",
                "Пётр", "Иван", "Пётр", "Антон", "Антон");
        System.out.println(repeat(workers));
    }

    public static Map<String, Integer> repeat(List<String> workers) {
        Map<String, Integer> repeatNameCount = new LinkedHashMap<>();

        for (int i = 0; i < workers.size(); i++) {
            if (repeatNameCount.containsKey(workers.get(i))) {
                repeatNameCount.put(workers.get(i), repeatNameCount.get(workers.get(i)) + 1);
            } else {
                repeatNameCount.put(workers.get(i), 1);
            }
        }

        Map<String, Integer> sortedMap = repeatNameCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortedMap;
    }

}