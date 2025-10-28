import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    public static String capitalize(String name) {
        if (name == null || name.length() == 0)
            return name;
        char[] chars = new char[name.length()];
        int i = 0;
        for (int j = 0; j < name.length(); j++) {
            char c = name.charAt(j);
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
                i++;
            } else {
                chars[i] = c;
                i++;
            }
        }
        return new String(chars, 0, i);
    }
}