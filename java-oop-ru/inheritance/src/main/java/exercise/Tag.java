package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
public class Tag {
    protected String tagName;
    protected Map<String, String> attributes;

    public String getName() {
        return tagName;
    }
    public String getAtribute() {
        if (attributes.isEmpty()) {
            return "";
        }
        return " " + attributes.entrySet().stream()
        .map(x -> (x.getKey() + "=\"" + x.getValue() + "\"")).collect(Collectors.joining(" "));
    }

    public String toString() {
        return "<" + this.getName() + getAtribute() + ">";
    }
}
// END
