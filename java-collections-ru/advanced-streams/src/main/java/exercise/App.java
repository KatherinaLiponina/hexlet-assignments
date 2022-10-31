package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// BEGIN
public final class App {
    public static String getForwardedVariables(String conf) {
        String[] confLines = conf.split("\n");
        List<String> allEnvs = new ArrayList<>();
        for (int i = 0; i < confLines.length; i++) {
            if (confLines[i].startsWith("environment=")) {
                String[] envs = confLines[i].substring(13, confLines[i].length() - 1).split(",");
                allEnvs.addAll(Arrays.asList(envs));
            }
        }
        allEnvs = allEnvs.stream()
        .filter(v -> v.indexOf("=") != -1 && v.startsWith("X_FORWARDED_"))
        .map(v -> v.replaceAll("X_FORWARDED_", ""))
        .collect(Collectors.toList());

        StringBuilder str = new StringBuilder();
        for (String string : allEnvs) {
            str.append(string);
            str.append(",");
        }
        str.deleteCharAt(str.length() - 1);
        return str.toString();
    }
}
//END
