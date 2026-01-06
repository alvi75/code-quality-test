import java.util.*;

public class Translation34 {
    public static String quote(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int apos = 0;
    for (int k = 0;
    k < str.length();
    ) {
        if (str.indexOf("\\E", apos) != -1) {
            sb.append( "\\Q");
            apos = str.indexOf("\\E", apos);
        }
    }
    return sb.append( str).append("\\E").toString();
}
}