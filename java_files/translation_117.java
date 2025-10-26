import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    final List<SpanQuery> spanQueries = new ArrayList<>();
    for (final Map.Entry<WeightedSpanQuery, Float> entry : weightBySpanQuery.entrySet()) {
        entry.getKey().setBoost(entry.getValue());
        spanQueries.add(entry.getKey());
    }
    if (spanQueries.size() == 1) return spanQueries.get(0);
    else return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
}
}