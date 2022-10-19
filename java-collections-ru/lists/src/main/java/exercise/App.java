package exercise;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public final class App {
    public static boolean scrabble(String charSet, String word) {
        charSet = charSet.toLowerCase();
        word = word.toLowerCase();
        List<String> letters = new ArrayList<>();
        for (int i = 0; i < charSet.length(); i++) {
            letters.add(Character.toString(charSet.charAt(i)));
        }
        for (int i = 0; i < word.length(); i++) {
            String symbol = Character.toString(word.charAt(i));
            if (letters.contains(symbol)) {
                letters.remove(symbol);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
