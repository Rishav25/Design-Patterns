import DocumentLetterFactory.LetterFactory;
import Letter.LetterInterface;

public class Main {
    public static void main(String[] args) {
        LetterFactory factory = new LetterFactory();

        LetterInterface letterInterface1 = factory.createLetter('a');
        // this one use cache
        LetterInterface letterInterface2 = factory.createLetter('a');
        LetterInterface letterInterface3 = factory.createLetter('b');
        LetterInterface letterInterface4 = factory.createLetter('c');
        // this one also uses cache
        LetterInterface letterInterface5 = factory.createLetter('c');

        letterInterface1.printLetter(0, 0);
        letterInterface2.printLetter(0, 1);
        letterInterface3.printLetter(0, 2);
        letterInterface4.printLetter(1, 1);
        letterInterface5.printLetter(1, 2);
    }
}
