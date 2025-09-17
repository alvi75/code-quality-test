import java.util.*;

public class Translationtranslation_706 {
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (byte[] b : table) {
            if (b == null)continue;
            if (sb.length() > 1)sb.append(", ");
            synchronized (b) {
                sb.append('"');
                sb.append(RawParseUtils.decode(b));
                sb.append('"');
            }
        }
        return sb.toString();
    }
}