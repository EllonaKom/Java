package OOP.dom6;

public class Book <T>{
    // Принцип единственной ответственности (SRP)
        private T name;
            
        public Book(T name) {
        this.name = name;
            }
        
            // Геттеры  для name 
        public T getName() {
        return name;
        }
        
        // Реализация  книги   
        @Override
        public String toString() {
        return String.format("Книга %s", name);
        } 
    }
    
       

