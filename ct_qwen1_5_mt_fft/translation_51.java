import java.util.*;

public class Translation51 {
    public List<CharSequence> uniqueStems(CharSequence word, int length) {
    List<CharSequence> stems = stem(word, length);
    if (stems.size() < 2) return stems;
    final Set<CharSequence> terms = new LinkedHashSet<>();
    for (CharSequence s : stems) {
        if (!terms.contains(s)) {
            terms.add(s);
        }
    }
    return Lists.newArrayList(terms);
}
}