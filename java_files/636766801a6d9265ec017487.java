import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    /**
 * Encoding the given string by changing '{' and '}' to the specified character for each,return the string after encoding.
 **/
public static String encodeTemplateNames(String s){
        if(s==null) return null;
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(c=='{') sb.append('{');
            else if(c=='}') sb.append('}');
            else sb.append(c);
        }
        return sb.toString();
    }
}