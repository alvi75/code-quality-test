import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_117 {
    public SpanQuery makeSpanClause() {
        List<SpanQuery> spanQueries = new ArrayList<>();
        for (WeightedSpanTerm wsq : weightedSpanTerms) {
            wsq.getSpanQuery().setWeight(wsq.getWeight());
            spanQueries.add(wsq.getSpanQuery());
        }
        if (spanQueries.size() == 1) {
            return spanQueries.get(0);
        }
        else {
            return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
        }
    }
}