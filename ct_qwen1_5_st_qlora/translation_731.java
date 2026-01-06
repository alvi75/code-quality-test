import java.util.*;

public class Translation731 {
    public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
    HashSet<WeightedTerm> terms = new HashSet<>();
    getTerms(query, terms, prohibited, fieldName);
    return terms.toArray();
}
}