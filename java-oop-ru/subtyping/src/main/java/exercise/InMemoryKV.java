package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
    private Map<String, String> mappa;

    public InMemoryKV(Map<String, String> startValue) {
        mappa = new HashMap<>(startValue);
    }

    @Override
    public void set(String key, String value) {
        if (mappa.containsKey(key)) {
            mappa.replace(key, value);
        } else {
            mappa.put(key, value);
        }
    }

    @Override
    public void unset(String key) {
        mappa.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        if (mappa.containsKey(key)) {
            return mappa.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(mappa);
    }
}
// END
