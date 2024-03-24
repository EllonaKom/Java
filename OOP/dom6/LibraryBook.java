package OOP.dom6;
        import java.util.ArrayList;
        import java.util.List;
public class LibraryBook  <T>{
        
    public List<Book<T>> books;
        
    public LibraryBook() {
    books = new ArrayList<>();
    
    }
    
    public void addBook(Book<T> book) {
    books.add(book);
    }
    
    
    
    }