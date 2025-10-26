import java.util.*;

public class Translation51 {
    public final List<CharsRef> uniqueStems(final char[] word, final int length) {
    final List<CharsRef> stems = stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    final CharArraySet terms = new CharArraySet( LuceneVersion.LUCENE_CURRENT, 8, dictionary.ignoreCase);
    for (final CharsRef s : stems) {
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.add(s);
        }
    }
    return deduped;
}
}