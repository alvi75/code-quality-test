import java.util.*;

public class Translation51 {
    ublic List<CharSequence> uniqueStems(char[] word, int length) {
    List<CharSequence> stems = stem(word, length);
    if (stems.size() < 2) {
        return stems;
    }
    CharArraySet terms = new CharArraySet(dictionary.get(), false);
    List<CharSequence> deduped = new ArrayList<>();
    for (CharSequence s : stems) {
        if (!terms.contains(s)) {
            deduped.add(s);
            terms.add(s);
        }
    }
    return deduped;
}
}