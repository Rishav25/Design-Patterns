package Letter;

public class Letter implements LetterInterface{
    private String font;
    private int size;
    private char letter;

    public Letter(String font, int size, char letter) {
        this.font = font;
        this.size = size;
        this.letter = letter;
    }

    public String getFont(){
        return this.font;
    }

    public int getSize(){
        return this.size;
    }

    public char getLetter(){
        return this.letter;
    }

    // here position params are the extrinsic values so we use them only in the fucntions.
    @Override
    public void printLetter(int x, int y){
        System.out.println("Letter '" + letter + "' of Font '" + font + "' with Size'" + size + "' printed at positon (" + x + "," + y + ")");
    }
    
}
