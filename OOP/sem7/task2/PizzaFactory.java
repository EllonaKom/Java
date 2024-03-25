package OOP.sem7.task2;

public class PizzaFactory {
    public Pizza createPizza(String name){
        switch (name) {
            case "Margherita":
                return new MargheritaPizza();
            case "Pepperoni":
                return new PepperoniPizza();
            case "Vegetarian":
                return new VegetarianPizza();
            default:
                return null;
        }
    }
}