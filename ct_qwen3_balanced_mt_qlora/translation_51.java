import java.util.*;

public class Translation51 {
    30 public List<CharSequence> uniqueStems(char[] word, int length) {
    List<CharSequence> stems = stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    CharArraySet terms = new CharArraySet(dictionary.ignoreCase ? LuceneVersion.LATEST : null, 8);
    List<CharSequence> deduped = new ArrayList<>();
    for (CharSequence s : stems) {
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.add(s);
        }
    }
    return deduped;
}
}