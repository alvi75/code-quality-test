import java.util.*;

public class Translationtranslation_731 {
    public static final WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
        if (fieldName == null) {
            throw new IllegalArgumentException("fieldName must be non-null");
        }
        return getTerms(query,prohibited,new Term(fieldName, ""));
    }
}