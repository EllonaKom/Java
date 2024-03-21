package OOP.sem2;

public class Cat2 extends Animal2 implements Feeding{
    @Override
  public void voice(){
       System.out.println("myau"); 
  } 

  @Override
  public void feed(){
      System.out.println("wiskas");
  }  
}
