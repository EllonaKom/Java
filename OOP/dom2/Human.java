package OOP.dom2;

public class Human extends Actor {

    @Override
    public String getName() {


        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;

        
    }

    @Override
    public boolean isTakeOrder() {

        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;

    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;

    }

    public Human(String name) {
        super(name);

    }

}