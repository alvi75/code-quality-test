import java.util.*;

public class Translation221 {
    public String stem(String word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null)return null;
    buffer.setLength(0);
    buffer.append(word);
    try {
        diff.apply(buffer, cmd);
    }
    catch (IOException bogus) {
        throw new RuntimeException(bogus);
    }
    if (buffer.length() > 0) {
        return buffer.toString();
    }
    else {
        return null;
    }
}
}