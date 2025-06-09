import aggregator.*;
import book.Book;
import iterator.IteratorI;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book a = new Book("Atomic Habits", "James Clear");
        Book b = new Book("Concepts of Physics", "H.C. Verma");
        Book c = new Book("White Nights", "Fyodor Dostoyevsky");
        Book d = new Book("Merchant of Venice", "William Shakespeare");
        Book e = new Book("1984", "George Orwell");

        List<Book> libraryList = Arrays.asList(a,c,e);
        List<Book> courseList = Arrays.asList(b,d);

        AggregatorI library = new Library(libraryList);
        AggregatorI course = new Course(courseList);

        IteratorI it1 = library.createIterator();
        IteratorI it2 = course.createIterator();

        System.out.println("Library");
        while(it1.hasNext()){
            it1.next();
        }

        System.out.println("\nCourse");
        while(it2.hasNext()){
            it2.next();
        }

    }
}
