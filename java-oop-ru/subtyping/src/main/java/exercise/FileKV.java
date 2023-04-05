package exercise;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
public class FileKV implements KeyValueStorage {
    private String filename;

    public FileKV(String path, Map<String, String> mappa) throws Exception {
        filename = path;
        Path fullPath = Paths.get(path).toAbsolutePath().normalize();
        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(mappa);
        Files.writeString(fullPath, content, StandardOpenOption.CREATE);
    }

    @Override
    public void set(String key, String value) {
        Map<String, String> mappa = Utils.unserialize(Utils.readFile(filename));
        if (mappa.containsKey(key)) {
            mappa.replace(key, value);
        } else {
            mappa.put(key, value);
        }
        Utils.writeFile(filename, Utils.serialize(mappa));
    }

    @Override
    public void unset(String key) {
        Map<String, String> mappa = Utils.unserialize(Utils.readFile(filename));
        mappa.remove(key);
        Utils.writeFile(filename, Utils.serialize(mappa));
    }

    @Override
    public String get(String key, String defaultValue) {
        Map<String, String> mappa = Utils.unserialize(Utils.readFile(filename));
        if (mappa.containsKey(key)) {
            return mappa.get(key);
        }
        return defaultValue;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(Utils.unserialize(Utils.readFile(filename)));
    }
}
// END
