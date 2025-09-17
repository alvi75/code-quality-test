import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_826 {
    public QueryScorer( WeightedSpanTerm[] weightedTerms ){
        this.fieldWeightedSpanTerms = new HashMap<>();
        for (int i = 0;
        i < weightedTerms.length;
        i++) {
            WeightedSpanTerm existingTerm = fieldWeightedSpanTerms.get(weightedTerms[i].term);
            if ((existingTerm == null)|| (existingTerm.weight < weightedTerms[i].weight)) {
                fieldWeightedSpanTerms.put(weightedTerms[i].term, weightedTerms[i]);
                maxTermWeight = Math.max(maxTermWeight, weightedTerms[i].getWeight());
            }
        }
        slop = 0;
        termsToLoad = null;
        initReader();
    }
}