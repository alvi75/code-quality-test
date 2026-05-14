import java.util.*;

public class Translation731 {
    public static List<WeightedTerm> getTerms(Query query, boolean prohibited,String fieldName) {
    Set<WeightedTerm> terms = new HashSet<>();
    if (fieldName != null) {
        terms.addAll(getTerms(new TermQuery(new Term(fieldName,"")),prohibited));
    }
    getTerms(query, terms, prohibited, fieldName);
    return new ArrayList<>(terms);
}
}