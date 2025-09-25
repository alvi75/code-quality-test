import java.util.*;

public class Translation117 {
    public Query makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (Map.Entry<String, Double> wsq : weightBySpanQuery.entrySet()) {
        wsq.setValue(Double.valueOf(wsq.getValue()));
        spanQueries.add(new SpanQuery(wsq.getKey(), wsq.getValue(), null));
    }
    if (spanQueries.size() == 1) {
        return spanQueries.get(0);
    }
    else {
        return new OrQuery(spanQueries.toArray(new SpanQuery[0]));
    }
}