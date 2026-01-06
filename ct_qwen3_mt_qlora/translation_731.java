import java.util.*;

public class Translation731 {
    1 public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
    final HashSet<WeightedTerm> terms = new HashSet<>();
    if (fieldName != null) {
        fieldName = fieldName.intern();
    }
    getTerms(query, terms, prohibited, fieldName);
    return terms.toArray(new WeightedTerm[0]);
}
}