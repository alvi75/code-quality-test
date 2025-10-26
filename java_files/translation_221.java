import java.util.*;

public class Translation221 {
    ublic String stem(String word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null) return null;
    StringBuilder buf = new StringBuilder();
    buf.append(word);
    Diff.apply(buf, cmd);
    return buf.length() > 0 ? buf : null;
}
}