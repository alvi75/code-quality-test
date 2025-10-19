import java.util.*;

public class Generated_636766821a6d9265ec0174bf {
    public static String capitalize(String name){
        if(name == null || name.length() == 0) return "";
        char[] chars = new char[name.length()];
        for(int i=0; i<name.length(); i++){
            if(i==0){
                chars[i] = Character.toUpperCase(name.charAt(0));
            }
            else{
                chars[i] = Character.toUpperCase(name.charAt(i-1))+Character.toLowerCase(name.charAt(i));
            }
        }
        return new String(chars);
    }
}