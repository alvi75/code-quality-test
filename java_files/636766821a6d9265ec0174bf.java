import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    public static String capitalize(String name){
        if(name == null || name.length() < 1) return name;
        char[] chars = name.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
}