package OOP.dom1;
import java.util.ArrayList;
import java.util.List;


// Создать наследника класса Продукта - ГорячийНапиток с дополнительным полем int температура.
// � Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать
// перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
// соответствующий имени, объему и температуре
// � В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
// воспроизвести логику заложенную в программе
// � Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new HotDrink("Чай", 123, 100, 100));
        productList.add(new HotDrink("Кофе", 200, 150, 80));
        productList.add(new HotDrink("Латте", 300, 120, 60));
        productList.add(new HotDrink("Капучино", 123, 160, 70));

        HotDrinksVendingMashine hotDrinksMashine = new HotDrinksVendingMashine();
        hotDrinksMashine.initProduct(productList);

        System.out.println(hotDrinksMashine.getProduct("Кофе"));

    }
}
// VenMach vendingMachine = new VenMach();
// vendingMachine.initProducts(prods);
// System.out.println(vendingMachine.getProduct("Минералка"));