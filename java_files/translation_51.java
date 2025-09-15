import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_51 {
    public List<CharsRef> uniqueStems(char word[], int length) {
        List<CharsRef> stems = stem(word, length);
        if (stems.size() < 2) {
            return stems;
        }
        CharArraySet terms = new CharArraySet(10, true);
        List<CharsRef> deduped = new ArrayList<>();
        for (CharsRef s : stems) {
            if (!terms.contains(s)) {
                deduped.add(s);
                terms.add(s);
            }
        }
        return deduped;
    }
}