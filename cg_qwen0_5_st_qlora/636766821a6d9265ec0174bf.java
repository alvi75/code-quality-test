import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    public static String capitalize(String name){
        if(name == null || name.length() == 0) return name;
        char[] chars = name.toCharArray();
        int i = 1;
        while(i < chars.length){
            if(Character.isUpperCase(chars[i])){
                chars[i] = Character.toLowerCase(chars[i]);
                break;
            }
            i++;
        }
        return new String(chars);
    }
}