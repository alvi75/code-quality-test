import java.util.*;

public class Translation34 {
    public static String quote(String string) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int apos = 0;
    int k;
    while ((k = string.indexOf("\\E", apos)) >= 0) {
        sb.append(substring(string, apos, k+2)).append("\\\\E\\Q");
        apos = k+2;
    }
    return sb.append(substring(string, apos)).append("\\E").toString();
}
}