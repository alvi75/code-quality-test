import java.util.*;

public class Translation51 {
    public List<CharsRef> uniqueStems(char[] word, int length) {
    List<CharsRef> stems = stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    CharSequenceIterator iterator = new CharSequenceIterator(stems.iterator());
    CharArraySet terms = new CharArraySet(LuceneVersion.LUCENE_CURRENT, 8, dictionary.ignoreCase);
    List<CharsRef> deduped = new ArrayList<>(stems.size());
    for (int i = 0;
    i < stems.size();
    ++i) {
        CharsRef term = stems.get(i);
        if (!terms.contains(term)) {
            deduped.add(term);
            terms.add(term);
        }
    }
    return deduped;
}
}