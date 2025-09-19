import java.util.*;

public class Translation51 {
    public Collection<CharsRef> uniqueStems(char[] word, int length) {
    Collection<CharsRef> stems = stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    final CharArraySet terms = new CharArraySet(Arrays.asList(dictionary.getWords()), false);
    Collection<CharsRef> deduped = new ArrayList<>();
    for(CharsRef s : stems) {
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.addAll(Arrays.asList(dictionary.getWords()));
        }
        return deduped;
    }
}