package exercise;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> list, int n) {
        return list.stream().sorted(Comparator.comparing(Home::getArea))
        .limit(n).map(x -> x.toString()).collect(Collectors.toList());
    }
}
// END
