import java.util.*;

public class Translation826 {
    public QueryScorer(final WeightedSpanTerm... weightedTerms) {
    for (final WeightedSpanTerm t : weightedTerms) {
        fieldWeightedSpanTerms.put(t.getTerm(), t);
    }
    skipInitExtractor = true;
}
}