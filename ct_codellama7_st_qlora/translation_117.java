import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (Map.Entry<SpanQuery, Float> wsq : weightBySpanQuery) {
        wsq.getKey().setBoost(wsq.getValue());
        spanQueries.add(wsq.getKey());
    }
    if (spanQueries.size() == 1)return spanQueries.get(0);
    return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
}
}