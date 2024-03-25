package OOP.dom7.Logger;

public class PrintLogger implements Logger {

    @Override
    public void logger(String text) {
        System.out.println(text);
    }

    
}