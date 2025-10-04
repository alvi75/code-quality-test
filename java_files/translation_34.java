import java.util.*;

public class Translation34 {
    public static String quote(String string) {
    StringBuilder sb = new StringBuilder();
    sb.append("'");
    int apos = 0;
    int k;
    while ((k = string.indexOf("'")) >= 0) {
        sb.append(string.substring(apos,k));
        sb.append("'");
        apos = k + 1;
    }
    sb.append(string.substring(apos));
    sb.append("'");
    return sb.toString();
}
}