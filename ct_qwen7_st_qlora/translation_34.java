import java.util.*;

public class Translation34 {
    public static String quote(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int apos = 0;
    int k;
    while ((k = str.indexOf("\\E", apos)) >= 0) {
        sb.append(str.substring(apos, k + 2)).append("\\\\E\\Q");
        apos = k + 2;
    }
    return sb.append(str.substring(apos)).append("\\E").toString();
}
}