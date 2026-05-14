import java.util.*;

public class Translation34 {
    public static String quote(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int apos=0;
    k:for (int i=0;
    i<str.length();
    i++) {
        switch(str.charAt(i)) {
            case '\\':case '\"':sb.append('\\');
            break;
            default:continue k;
            break;
        }
    }
    return sb.append(str).append("\\E").toString();
}
}