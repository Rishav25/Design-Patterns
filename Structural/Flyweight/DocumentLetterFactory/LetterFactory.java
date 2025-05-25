package DocumentLetterFactory;

import Letter.Letter;
import Letter.LetterInterface;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, LetterInterface> cacheMap = new HashMap<>();

    public static LetterInterface createLetter(char letter){
        if(cacheMap.containsKey(letter)){
            return cacheMap.get(letter);
        }
        else{
            String font = "Helvetica";
            int size = 12;
            LetterInterface letterI = new Letter(font, size, letter);
            cacheMap.put(letter, letterI);
            return letterI;
        }
    }
}
