import java.util.*;

public class Translation51 {
    public List<CharsRef> uniqueStems(char[] word, int length) {
    List<CharsRef> stems = stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    CharArraySet terms = new CharArraySet();
    for (CharsRef s : stems) {
        if (!terms.contains(s)) {
            terms.add(s);
        }
    }
    List<CharsRef> deduped = new ArrayList<>();
    for (CharsRef s : stems) {
        if (terms.contains(s)) {
            deduped.add(s);
        }
    }
    return deduped;
}
}