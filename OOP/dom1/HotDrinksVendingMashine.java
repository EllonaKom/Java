package OOP.dom1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMashine implements VendingMachine {

    private List<Product> hotList = new ArrayList<>();

    @Override
    public void initProduct(List<Product> hotList) {

        this.hotList = hotList;
    }

    @Override
    public Product getProduct(String name) {

        for (Product item : hotList)
            if (item.getName().equals(name))
                return item;
        return null;
    }

    public Product getProduct(String name, int volume, int temperature) {

        for (Product item : hotList)
            if (item.getName().equals(name) && ((HotDrink) item).getVolume() == volume
                    && ((HotDrink) item).getTemperature() == temperature)
                return item;

        return null;

    }

}