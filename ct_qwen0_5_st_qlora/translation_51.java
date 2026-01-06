import java.util.*;

public class Translation51 {
    public List<CharsRef> uniqueStems(char[] word, int length) {
    List<CharsRef> stems = stem(word, length);
    if (stems.size()<2)return stems;
    Set<CharsRef> terms = new HashSet<>();
    for (CharsRef s : stems) {
        if (!terms.add(s)) {
            terms.remove(s);
        }
    }
    return new ArrayList<>(terms);
}
}