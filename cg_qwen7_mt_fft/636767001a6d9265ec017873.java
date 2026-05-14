import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str) {
        if (str == null || str.length() == 0){
            return "";
        }
        final StringBuilder buffer = new StringBuilder(str);
        for(int i=0; i<buffer.length(); i++){
            char temp = buffer.charAt(i);
            buffer.setCharAt(i, buffer.charAt(buffer.length()-1-i));
            buffer.setCharAt(buffer.length()-1-i, temp);
        }
        return buffer.toString();
    }
}