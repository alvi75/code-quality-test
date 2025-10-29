import java.util.*;

public class Translation826 {
    0;
for (int i = 0;
i < weightedTerms.Length;
++i){
    WeightedSpanTerm t = weightedTerms[i];
    if (!fieldWeightedSpanTerms.containsKey(t.term)) {
        fieldWeightedSpanTerms.put(t.term, t);
        maxTermWeight = Math.max(maxTermWeight, t.weight);
    }
}
skipInitExtractor = true;
}
}