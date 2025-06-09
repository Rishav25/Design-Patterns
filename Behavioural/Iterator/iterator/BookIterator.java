package iterator;

import java.util.List;

import book.Book;

public class BookIterator implements IteratorI{

    List<Book> books;
    int position = 0;

    public BookIterator(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext(){
        return position < books.size();
    }

    @Override
    public void next(){
        System.out.println(books.get(position));
        position = position + 1;
    }
    
}
