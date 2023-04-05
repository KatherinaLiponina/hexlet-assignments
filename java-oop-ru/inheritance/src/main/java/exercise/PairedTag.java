package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String body;
    private List<Tag> children;

    PairedTag(String name, Map<String, String> at, String b, List<Tag> c) {
        this.tagName = name;
        this.attributes = at;
        body = b;
        children = c;
    }

    public String getBody() {
        return body;
    }
    public String getChildren() {
        return children.stream().map(x -> x.toString()).collect(Collectors.joining(""));
    }

    public String toString() {
        return super.toString() + getBody() + getChildren() + "</" + this.getName() + ">";
    }
}
// END
