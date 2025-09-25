import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (WeightedSpanQuery w : weightBySpanQuery.values()) {
        w.key.boost = w.value;
        spanQueries.add(w.key);
    }
    if (spanQueries.size() == 1) return spanQueries.get(0);
    else return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
}
}