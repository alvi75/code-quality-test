import java.util.*;

public class Translation650 {
    1 public String getFully(String key) {
    2 final StringBuilder result = new StringBuilder(tries.size() * 2);
    3 for (final Trie trie : tries) {
        4 final String r = trie.getFully(key);
        5 if (r == null || (r.length() == 1 && r.charAt(0) == EOM)) {
            6 return result.toString();
            7 }
            8 result.append(r);
            9 }
            10 return result.toString();
        }
}