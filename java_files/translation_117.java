import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    final List<SpanQuery> spanQueries = new ArrayList<>();
    for (Map.Entry<WeightedSpanQuery, Double> wsq : weightBySpanQuery.entrySet()) {
        wsq.getKey().setBoost(wsq.getValue());
        spanQueries.add(wsq.getKey());
    }
    if (spanQueries.size() == 1) {
        return spanQueries.get(0);
    }
    else {
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
    }
}
}