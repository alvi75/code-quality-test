import java.util.*;

public class Translationtranslation_221 {
    public CharSequence stem(CharSequence word) {
        String cmd = stemmer.getLastOnPath(word.toString());
        if (cmd == null) return null;
        if (cmd.length() == word.length())return new StringCharacterIterator(cmd);
        return cmd.substring(0, cmd.length());
    }
}