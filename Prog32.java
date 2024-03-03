// Задание №2.1
// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prog32 {
    public static void main(String[] args) {
        List<String> planets = getPlanets();
        printRepeatPlanets(planets);
        System.out.println(planets);
        deleteRepeatPlanets(planets);
        System.out.println(planets);
    }

    private static List<String> getPlanets() {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Меркурий");
        planets.add("Меркурий");
        planets.add("Уран");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Венера");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Нептун");
        planets.add("Земля");
        planets.add("Плутон");
        planets.add("Меркурий");
        return planets;
    }

    private static void printRepeatPlanets(List<String> listPlanets) {
        List<String> sortedListPlanets = new ArrayList<>(listPlanets);
        Collections.sort(sortedListPlanets);
        int count = 1;
        String currentPlanet = sortedListPlanets.get(0);
        for (int i = 1; i < sortedListPlanets.size(); i++) {
            if (sortedListPlanets.get(i).equals(currentPlanet)) {
                count++;
            } else {
                System.out.println(currentPlanet + " -> " + count);
                count = 1;
                currentPlanet = sortedListPlanets.get(i);
            }
        }
        System.out.println(currentPlanet + " -> " + count);
    }

    private static void deleteRepeatPlanets(List<String> listPlanets) {
        for (int i = 0; i < listPlanets.size(); i++) {
            String currentPlanet = listPlanets.get(i);
            for (int j = listPlanets.size() - 1; j > i; j--) {
                if (listPlanets.get(j).equals(currentPlanet)) {
                    listPlanets.remove(j);
                }
            }
        }
    }
}