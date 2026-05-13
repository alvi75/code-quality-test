import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    final List<SpanQuery> spanQueries = new ArrayList<>();
    for(Map.Entry<SpanQueryBuilder.SpanWeightQuery, Float> wsq : weightBySpanQuery.entrySet()) {
        wsq.getKey().query.setBoost( wsq.getValue() );
        spanQueries.add(wsq.getKey().query);
    }
    if (spanQueries.size()==1) return spanQueries.get(0);
    elsedeviseNameForClause();
    return new SpanOrBuilder(spanQueries).setSlop(getSlop()).setName(name).build();
}
}