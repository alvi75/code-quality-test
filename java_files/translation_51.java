import java.util.*;

public class Translation51 {
    public List<CharsRef> uniqueStems(char word[], int length) {
    List<CharsRef> stems = stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    CharArraySet terms = new CharArraySet(10, true);
    List<CharsRef> deduped = new ArrayList<>();
    for (CharsRef s : stems) {
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.add(s);
        }
    }
    return deduped;
}
}