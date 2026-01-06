import java.util.*;

public class Translation826 {
    public QueryScorer(WeightedSpanTerm[] weightedTerms) {
    this.fieldWeightedSpanTerms = new HashMap<String, WeightedSpanTerm>();
    for (WeightedSpanTerm t : weightedTerms) {
        if (!fieldWeightedSpanTerms.containsKey(t.getTerm())){
            fieldWeightedSpanTerms.put(t.getTerm(), t);
        }
        maxTermWeight = Math.max(maxTermWeight, t.getWeight());
    }
    skipInitExtractor = true;
}
}