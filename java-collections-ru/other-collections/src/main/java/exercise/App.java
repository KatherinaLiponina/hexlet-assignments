package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public final class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        LinkedHashMap<String, String> resultMap = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>(String::compareTo);
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        keys.stream()
            .forEach(x -> {
                if (map1.containsKey(x) && map2.containsKey(x)) {
                    if (map1.get(x).equals(map2.get(x))) {
                        resultMap.put(x, "unchanged");
                    } else {
                        resultMap.put(x, "changed");
                    }
                } else if (map1.containsKey(x)) {
                    resultMap.put(x, "deleted");
                } else {
                    resultMap.put(x, "added");
                }
            });
        return resultMap;
    }
}
//END
