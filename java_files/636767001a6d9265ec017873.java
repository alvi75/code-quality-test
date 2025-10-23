import java.util.*;

public class Generated_636767001a6d9265ec017873 {
    public static String reverse(final String str){
        if(str == null || str.length() < 2) return str;
        final StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}