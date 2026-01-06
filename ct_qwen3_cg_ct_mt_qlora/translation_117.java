import java.util.*;

public class Translation117 {
    ublic SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (Map.Entry<SpanQuery, Float> wsq : weightBySpanQuery.entrySet()) {
        wsq.getKey().boost = wsq.getValue();
        spanQueries.add(wsq.getKey());
    }
    if (spanQueries.size() == 1) {
        return spanQueries.get(0);
    }
    else {
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
    }
}