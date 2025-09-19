import java.util.*;

public class Translation221 {
    public CharSequence stem(CharSequence word) {
    String cmd = stemmer.getLastOnPath(word);
    if (cmd == null) return null;
    if (cmd.length() == word.length())return new StringCharacterIterator(cmd);
    else if (cmd.length() < word.length())return new StringCharacterIterator(cmd, 0, cmd.length());
    elsereturn null;
}
}