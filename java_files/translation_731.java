import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_731 {
    public static WeightedTerm[] getTerms(Query query, boolean prohibited, String fieldName) {
        Set<WeightedTerm> terms = new HashSet<>();
        if (prohibited) {
            terms.addAll(query.getTerms(fieldName));
        }
        else {
            terms.addAll( Collection.<WeightedTerm> of( query.getWeightedTerms(fieldName) );
        }
        return terms.toArray(new WeightedTerm[0]);
    }
}