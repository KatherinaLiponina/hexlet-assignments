package exercise;

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws Exception  {
        try {
            Files.writeString(path, car.serialize(), StandardOpenOption.WRITE);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Car extract(Path path) throws Exception  {
        String content = "";
        try {
            content = Files.readString(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Car.unserialize(content);
    }
}
// END
