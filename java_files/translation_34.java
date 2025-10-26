import java.util.*;

public class Translation34 {
    public static String quote(String string) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int apos = 0;
    int k;
    while ((k = string.indexOf("\\E", apos)) >= 0) {
        sb.append(string.substring(apos, k+2));
        apos = k+2;
    }
    return sb.append(string.substring(apos)).append("\\E").toString();
}
}