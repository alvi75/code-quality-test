import java.util.*;

public class Translation51 {
    public List<CharsRef> uniqueStems(char word[], int length) {
    final List<CharsRef> stems = stem(word, length);
    if (stems.size() < 2)return stems;
    final Set<CharsRef> terms = new CharArraySet(LuceneVersion.LUCENE_CURRENT, 8, dictionary.isIgnoreCase());
    final List<CharsRef> deduped = new ArrayList<>();
    for(CharsRef s : stems) {
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.add(s);
        }
    }
    return deduped;
}
}