import java.util.*;

public class Translation221 {
    public StringBuilder stem(String word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null)return null;
    buffer.setLength(0);
    buffer.append(word);
    Diff.apply(buffer, cmd);
    if (buffer.length() > 0)return buffer;
    elsereturn null;
}
}