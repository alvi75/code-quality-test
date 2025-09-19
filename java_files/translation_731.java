import java.util.*;

public class Translation731 {
    public static final WeightedTerm[] getTerms( Query query, boolean prohibited, String fieldName ){
    final Set<String> terms = new HashSet<>();
    getTerms(query, terms,prohibited, fieldName);
    return terms.toArray(new WeightedTerm[terms.size()]);
}
}