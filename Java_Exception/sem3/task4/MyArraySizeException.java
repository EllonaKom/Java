package Java_Exception.sem3.task4;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException() {
    super("Массив должен быть 3х3");
    }
    }