package OOP.dom2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Андрей");
        Human human2 = new Human("Иван");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
        market.update();

    }
    
}