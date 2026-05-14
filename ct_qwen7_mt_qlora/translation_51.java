import java.util.*;

public class Translation51 {
    1 public List<CharSequence> uniqueStems(CharSequence word) {
    final List<CharSequence> stems = stem(word);
    if (stems.size() < 2) {
        return stems;
    }
    final Set<CharSequence> terms = new HashSet<>();
    final List<CharSequence> deduped = new ArrayList<>(stems.size());
    for (int i = 0;
    i < stems.size();
    ++i) {
        final CharSequence s = stems.get(i);
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.add(s);
        }
    }
    return deduped;
}
}