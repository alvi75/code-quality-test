import java.util.*;

public class Translation826 {
    public QueryScorer(WeightedSpanTerm[] weightedTerms) {
    this.weightedTerms = weightedTerms;
    maxTermWeight = 0;
    for (int i = 0;
    i < weightedTerms.length;
    i++) {
        maxTermWeight = Math.max(maxTermWeight, weightedTerms[i].getWeight());
    }
}
}