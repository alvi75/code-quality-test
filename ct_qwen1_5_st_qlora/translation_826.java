import java.util.*;

public class Translation826 {
    public QueryScorer(WeightedSpanTerm... weightedTerms) {
    this.weightedTerms = weightedTerms.clone();
    for (int i = 0;
    i < weightedTerms.length;
    i++) {
        final WeightedSpanTerm wst = weightedTerms[i];
        if (!fieldWeightedSpanTerms.containsKey(wst.term)) {
            fieldWeightedSpanTerms.put(wst.term, wst);
            maxTermWeight = Math.max(maxTermWeight, wst.weight);
        }
    }
}
}