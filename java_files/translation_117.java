import java.util.*;

public class Translation117 {
    ublic SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    for (WeightedSpanTerm wsq : weightBySpanQuery.values()) {
        wsq.getTerm().setBoost(wsq.weight);
        spanQueries.add(wsq.getSpanTermQuery());
    }
    if (spanQueries.size() == 1) {
        return spanQueries.get(0);
    }
    else {
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[0]));
    }
}
}