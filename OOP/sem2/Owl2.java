package OOP.sem2;

public class Owl2 extends Animal2 implements Feeding{
    @Override
    public void voice(){
     
      System.out.println("uhuu");
    } 
    @Override
  public void feed(){
   
    System.out.println("mouse");
  } 
}
