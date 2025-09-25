import java.util.*;

public class Translation34 {
    public static String quote(String str) {
    StringBuilder sb = new StringBuilder();
    sb.append("\\Q");
    int aPos = 0;
    int k;
    while ((k = str.indexOf("\\E", aPos)) >= 0) {
        sb.append(str.substring(aPos, k + 2)).append("\\\\E\\Q");
        aPos = k + 2;
    }
    return sb.append(str.substring(aPos)).append("\\E").toString();
}
}