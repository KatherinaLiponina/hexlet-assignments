package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public final class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        HashMap<String, Integer> wordsCount = new HashMap<>();
        if (!sentence.isEmpty()) {
            String[] words = sentence.split(" ");
            for (String string : words) {
                if (wordsCount.containsKey(string)) {
                    int value = wordsCount.get(string);
                    value++;
                    wordsCount.replace(string, value);
                } else {
                    wordsCount.put(string, 1);
                }
            }
        }
        return wordsCount;
    }

    public static String toString(Map<String, Integer> mappa) {
        StringBuilder resultConstructor = new StringBuilder("{");
        for (Map.Entry<String, Integer> word: mappa.entrySet()) {
            resultConstructor.append("\n  " + word.getKey() + ": " + word.getValue());
        }
        if (!mappa.isEmpty()) {
            resultConstructor.append("\n");
        }
        resultConstructor.append("}");
        return resultConstructor.toString();
    }
}
//END
