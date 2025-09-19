import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (WeightedSpanTerm wsq : weightedSpanTerms) {
        wsq.setBoost(getWeight());
        spanQueries.add(wsq.makeSpanQuery());
    }
    if (spanQueries.size() == 1) {
        return spanQueries.get(0);
    }
    else {
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
    }
}
}