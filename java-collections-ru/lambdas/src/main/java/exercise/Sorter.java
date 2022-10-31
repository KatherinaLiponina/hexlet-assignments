package exercise;

//import java.util.Comparator;
import java.util.Map;
import java.util.List;
//import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public final class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
        .filter(user -> user.get("gender").equals("male"))
        .sorted((user1, user2) -> birthdayCompare(user1.get("birthday"), user2.get("birthday")))
        .map(user -> user.get("name"))
        .collect(Collectors.toList());
    }

    private static int birthdayCompare(String str1, String str2) {
        if (str1.equals(str2)) {
            return 0;
        }
        String[] numbers1 = str1.split("-");
        String[] numbers2 = str2.split("-");
        for (int i = 0; i < numbers1.length; i++) {
            if (Integer.parseInt(numbers1[i]) > Integer.parseInt(numbers2[i])) {
                return 1;
            } else if (Integer.parseInt(numbers1[i]) < Integer.parseInt(numbers2[i])) {
                return -1;
            }
        }
        return 0;
    }
}

// END
