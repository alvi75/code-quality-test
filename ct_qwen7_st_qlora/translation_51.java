import java.util.*;

public class Translation51 {
    public List<CharsRef> uniqueStems(char[] word, int length) {
    final List<CharsRef> stems = stem(word, length);
    if (stems.size() < 2) return stems;
    final Set<CharsRef> terms = new HashSet<>();
    final List<CharsRef> deduped = new ArrayList<>(stems.size());
    for(CharsRef s : stems) {
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.add(s);
        }
    }
    return Collections.unmodifiableList(deduped);
}
}