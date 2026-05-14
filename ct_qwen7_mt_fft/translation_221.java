import java.util.*;

public class Translation221 {
    public String stem(String word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null) return null;
    final StringBuffer buffer = new StringBuffer();
    buffer.append(word);
    diff_apply( buffer, cmd );
    if (buffer.length() > 0) {
        return buffer.toString();
    }
    else {
        return null;
    }
}
}