package OOP.dom6;

import java.util.ArrayList;
import java.util.List;

public class Library<T, K, V> {
   
private int orderCounter;
private List<LibraryCard<K, V>> orders;

public Library() {
orders = new ArrayList<>();
orderCounter = 0;
}



void createOrder(LibraryCard<K, V> order) {
orders.add(order);
orderCounter++;
}

@Override
public String toString() {
return "list = " + "№" + orderCounter + orders;
}



public void addBook(Book book) {
    
    
}







}