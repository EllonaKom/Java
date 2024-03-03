import java.util.HashSet;
import java.util.Set;

public class CatMain {
public static void main(String[] args) {
Cat cat1 = new Cat("Барсик", 2, "Серый");
Cat cat2 = new Cat("Васька", 1, "Чёрный");
Cat cat3 = new Cat("Мурка", 3, "Белый");
Cat cat4 = new Cat("Мурка", 3, "Белый");
Cat cat5 = new Cat("Мурка", 3, "Белый");

Set<Cat> set = new HashSet<>();
set.add(cat1);
set.add(cat2);
set.add(cat3);
set.add(cat4);
set.add(cat5);

for (Cat cat : set) {
System.out.println(cat);
System.out.println();
}
}
}