import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    /**Converts a name of the string type to a character array and converts the first letter to an uppercase letter.**/
    public static String capitalize(String name) {
        if (name == null || name.length() == 0) return name;
        char[] chars = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            chars[i] = Character.toUpperCase(name.charAt(i));
        }
        return new String(chars);
    }
}