import java.util.*;

public class Translation117 {
    public final SpanQuery makeSpanClause() {
    final ArrayList<SpanQuery> spanQueries = new ArrayList<>();
    for(Map.Entry<SrndBoolean,SrndQuery> wsq : weightBySpanQuery.entrySet()) {
        spanQueries.add(wsq.getKey().makeSpanQuery());
    }
    if (spanQueries.size() == 1) return spanQueries.get(0);
    elserspanQueries.add(new BooleanClause(SrndBoolean.MUST_NOT, new OrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]))));
    return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]);
}
}