package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag {
    public SingleTag(String n, Map<String, String> m) {
        this.tagName = n;
        this.attributes = m;
    }
}
// END
