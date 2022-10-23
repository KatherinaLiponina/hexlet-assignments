package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
//import java.util.Map.Entry;

// BEGIN
public final class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> finded = new ArrayList<>();
        boolean fits = true;
        for (Map<String, String> book : books) {
            fits = true;
            for (Map.Entry<String, String> bookData : where.entrySet()) {
                if (!book.containsKey(bookData.getKey()) || !book.get(bookData.getKey()).equals(bookData.getValue())) {
                    fits = false;
                    break;
                }
            }
            if (fits) {
                finded.add(book);
            }
        }
        return finded;
    }
}
//END
