package OOP.sem1;

public class Main {
    static Cat  cat = new Cat();
    public static void main(String[] args) {
        
      //  cat.name = "Boris";
      //  cat.age = 4;
      cat.setName("Boris");
      cat.setAge(5);
        System.out.println(cat);
        badMethod();
        RussianGreyCat russianGreyCat = new RussianGreyCat();
        // russianGreyCat.purr();
        // cat.purr();
        russianGreyCat.voice();
        Animal.sayHello();
    }
    public static void badMethod(){
      //  cat.name = "Murzik";
      cat.setName("Murzik");
        System.out.println(cat);
    }
}
