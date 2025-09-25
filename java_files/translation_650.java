import java.util.*;

public class Translation650 {
    public String getFully(CharSequence key) {
    final int len = key.length();
    StringBuilder result = new StringBuilder(len);
    for(int i=0;
    i<len;
    i++) {
        char ch = key.charAt(i);
        if(ch==EOM_CHAR)break;
        if(!contains(ch)) {
            return null;
        }
        result.append((char)getByte(ch));
    }
    return result.toString();
}
}