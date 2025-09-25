import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (WeightedSpanQuery wsq : weightBySpanQuery.values()) {
        wsq.getSpanQuery().boost(wsq.getWeight());
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