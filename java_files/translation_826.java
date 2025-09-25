import java.util.*;

public class Translation826 {
    public QueryScorer(WeightedSpanTerm[] weightedTerms) {
    this.fieldWeightedSpanTerms = new HashMap<>();
    for (WeightedSpanTerm t : weightedTerms) {
        if(!fieldWeightedSpanTerms.containsKey(t.term)) {
            fieldWeightedSpanTerms.put(t.term, t);
            maxTermWeight = Math.max(maxTermWeight, t.weight);
        }
        else {
            fieldWeightedSpanTerms.get(t.term).weight += t.weight;
        }
    }
    skipInitExtractor = true;
}
}