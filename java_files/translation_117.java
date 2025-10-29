import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (WeightedBySpanQuery w : weightBySpanQuery) {
        w.key.boost = w.value;
        spanQueries.add(w.key);
    }
    if (spanQueries.size() == 1)return spanQueries.get(0);
    return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
}
}