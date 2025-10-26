import java.util.*;

public class Translation221 {
    public String stem(String word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null) return null;
    StringBuilder buf = new StringBuilder();
    buf.append(word);
    diff.apply(buf, cmd);
    if (buf.length() > 0) return buf.toString();
    else return null;
}
}