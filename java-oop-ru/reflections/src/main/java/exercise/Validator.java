package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// BEGIN
public class Validator {
    public static List<String> validate(Object obj) {
        List<String> failedValidation = new ArrayList<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            NotNull nn = field.getAnnotation(NotNull.class);
            if (nn != null) {
                try {
                    field.setAccessible(true);
                    Object f = field.get(obj);
                    if (f == null) {
                        failedValidation.add(field.getName());
                    }
                    
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }
        return failedValidation;
    }

    public static Map<String, String> advancedValidate(Object obj) {
        Map<String, String> failedValidation = new HashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            NotNull nn = field.getAnnotation(NotNull.class);
            if (nn != null) {
                try {
                    field.setAccessible(true);
                    Object f = field.get(obj);
                    if (f == null) {
                        failedValidation.put("NotNull", field.getName());
                    }
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
            MinLength ml = field.getAnnotation(MinLength.class);
            if (ml != null) {
                try {
                    field.setAccessible(true);
                    if (field.get(obj) != null) {
                        String f = String.valueOf(field.get(obj));
                        if (f.length() < ml.minLength()) {
                            failedValidation.put("MinLength", field.getName());
                        }
                    }
                } catch (IllegalAccessException | IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }
        return failedValidation;
    }
}
// END
