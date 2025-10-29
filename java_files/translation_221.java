import java.util.*;

public class Translation221 {
    public String stem(String word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null) return null;
    StringBuilder sb = new StringBuilder();
    sb.append(word);
    Diff.apply(sb, cmd);
    return sb.toString();
}
}