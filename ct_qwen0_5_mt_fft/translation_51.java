import java.util.*;

public class Translation51 {
    public List<CharsRef> uniqueStems(char[] word, int length) {
    List<CharsRef> stems = Stem(word, length);
    if (stems.size() < 2)return stems;
    final Set<CharsRef> terms = new HashSet<>();
    for (final CharsRef s : stems) {
        if (!terms.add(s)) {
            return null;
        }
    }
    final List<CharsRef> deduped = Lists.newArrayList(stems);
    deduped.removeAll(terms);
    return deduped;
}
}