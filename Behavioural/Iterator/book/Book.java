package book;

public class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    @Override
    public String toString(){
        return "Title : " + this.title + " , Author : " + this.author;
    }
}
