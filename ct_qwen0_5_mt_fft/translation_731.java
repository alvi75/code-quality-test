import java.util.*;

public class Translation731 {
    public static List<WeightedTerm> getTerms(Query query, boolean prohibited, String fieldName) {
    List<WeightedTerm> terms = new ArrayList<>();
    if (fieldName == null) {
        fieldName = "";
    }
    getTerms(query, terms, prohibited, fieldName);
    return terms;
}
}