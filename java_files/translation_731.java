import java.util.*;

public class Translation731 {
    public static final WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
    final Set<WeightedTerm> terms = new HashSet<>();
    if (fieldName != null) {
        fieldName = fieldName.trim();
    }
    getTerms(query, terms,prohibited, fieldName);
    return terms.toArray(new WeightedTerm[terms.size()]);
}
}