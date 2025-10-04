import java.util.*;

public class Translation221 {
    public CharSequence stem(CharSequence word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null) return null;
    buffer.setLength(0);
    buffer.append(cmd);
    diff.apply(buffer, cmd);
    return buffer.get();
}
}