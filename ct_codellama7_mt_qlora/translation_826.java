import java.util.*;

public class Translation826 {
    public QueryScorer(WeightedSpanTerm[] weightedTerms) {
    this.fieldWeightedSpanTerms = new HashMap<String, WeightedSpanTerm>(weightedTerms.length);
    for (WeightedSpanTerm t : weightedTerms) {
        if (!fieldWeightedSpanTerms.containsKey(t.term) || fieldWeightedSpanTerms.get(t.term).weight < t.weight) {
            fieldWeightedSpanTerms.put(t.term, t);
            maxTermWeight = Math.max(maxTermWeight, t.weight);
        }
    }
    skipInitExtractor = true;
}
}