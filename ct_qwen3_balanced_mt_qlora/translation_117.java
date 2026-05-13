import java.util.*;

public class Translation117 {
    ublic SpanQuery makeSpanClause() {
    final List<SpanQuery> spanQueries = new ArrayList<>();
    for (WeightedSpanTerm wt : this.weightBySpanQuery.values()) {
        wt.getTerm().boost = wt.getWeight();
        spanQueries.add(wt.getSpanTermQuery());
    }
    if (spanQueries.size() == 1) {
        return spanQueries.get(0);
    }
    else {
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
    }
}
}