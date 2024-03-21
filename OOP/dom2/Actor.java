package OOP.dom2;

public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected Boolean isMakeOrder;
    protected Boolean isTakeOrder;
    
    public Actor(String name2) {
        //TODO Auto-generated constructor stub
    }

    public abstract String getName();
    
    }