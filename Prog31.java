// Задание №1
// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на
// экран.
import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Prog31 {
    public static void main(String[] args) {

        List<Integer> list = getRandomArray();
        System.out.println(list);
        Collections.sort(list);
        System.out.println();
        System.out.println(list);

    }

    private static List<Integer> getRandomArray() {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

}