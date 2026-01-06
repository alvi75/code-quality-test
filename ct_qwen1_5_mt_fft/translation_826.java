import java.util.*;

public class Translation826 {
    public QueryScorer(WeightedSpanTerm[] weightedTerms) {
    this.weightedSpanTerms = new HashMap<>(Arrays.asList(weightedTerms));
    maxTermWeight = 0;
    for (WeightedSpanTerm t : weightedTerms) {
        maxTermWeight = Math.max(maxTermWeight, t.getWeight());
    }
}
}