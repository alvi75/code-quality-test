import java.util.*;

public class Translation221 {
    public String stem(String word) {
    String cmd = stemmer.getStem(word);
    if (cmd == null) return null;
    StringBuilder buf = new StringBuilder();
    buf.append(word);
    Diff.apply(buf, cmd);
    return buf.toString();
}
}