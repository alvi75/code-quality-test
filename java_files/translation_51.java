import java.util.*;

public class Translation51 {
    ublic List<CharsRef> uniqueStems(char[] word, int length) {
    List<CharsRef> stems = Stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    CharArraySet terms = new CharArraySet();
    for (int i = 0;
    i < stems.size();
    i++) {
        CharsRef s = stems.get(i);
        if (!terms.contains(s)) {
            terms.add(s);
        }
    }
    List<CharsRef> deduped = new ArrayList<>();
    for (int i = 0;
    i < stems.size();
    i++) {
        CharsRef s = stems.get(i);
        if (terms.contains(s)) {
            deduped.add(s);
        }
    }
    return deduped;
}
}