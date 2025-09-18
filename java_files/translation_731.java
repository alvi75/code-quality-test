import java.util.*;

public class Translation731 {
    public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
    Set<WeightedTerm> terms = new HashSet<>();
    if (fieldName != null) {
        fieldName = fieldName.trim();
    }
    getTerms(query, terms,prohibited, null);
    return terms.toArray(new WeightedTerm[0]);
}
}