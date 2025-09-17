import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_731 {
    public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
        Set<String> terms = new HashSet<>();
        if (prohibited != null && prohibited.length > 0) {
            for(String p : prohibited) {
                p = p.trim().toLowerCase(Locale.ROOT);
                terms.add(p);
            }
        }
        getTerms(query, terms, false, fieldName);
        return terms.toArray(new WeightedTerm[terms.size()]);
    }
}