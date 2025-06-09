package aggregator;

import book.Book;
import iterator.*;

import java.util.List;

public class Course implements AggregatorI {
    List<Book> booksList;

    public Course(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public IteratorI createIterator(){
        return new BookIterator(booksList);
    }
    
}
