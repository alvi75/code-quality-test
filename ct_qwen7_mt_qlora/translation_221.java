import java.util.*;

public class Translation221 {
    1 public String stem(String word) {
    2 String cmd = stemmer.getLastOnPath(word);
    3 if (cmd == null)4 return null;
    5 buffer.setLength(0);
    6 buffer.append(word);
    7 Diff.apply(buffer, cmd);
    8 if (buffer.length() > 0)9 return buffer.toString();
    10 else11 return null;
}
}