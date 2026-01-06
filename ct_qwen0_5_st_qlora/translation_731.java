import java.util.*;

public class Translation731 {
    public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
    Set<String> terms = new HashSet<>();
    if (fieldName != null) {
        fieldName = fieldName.intern();
    }
    getTerms(query, terms, prohibited, fieldName);
    return terms.toArray(new WeightedTerm[terms.size()]);
}
}