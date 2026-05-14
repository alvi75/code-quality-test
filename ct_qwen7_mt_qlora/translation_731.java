import java.util.*;

public class Translation731 {
    1 public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
    2 final Set<WeightedTerm> terms = new HashSet<>();
    3 if (fieldName != null) {
        4 fieldName = fieldName.intern();
        5 }
        6 getTerms(query, terms, prohibited, fieldName);
        7 return terms.toArray(new WeightedTerm[terms.size()]);
    }
}