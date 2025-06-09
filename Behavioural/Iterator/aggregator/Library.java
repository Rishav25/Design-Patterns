package aggregator;

import book.Book;
import iterator.BookIterator;
import iterator.IteratorI;

import java.util.List;

public class Library implements AggregatorI {
    List<Book> booksList;

    public Library(List<Book> booksList) {
        this.booksList = booksList;
    }

    @Override
    public IteratorI createIterator(){
        return new BookIterator(booksList);
    }
    
}
