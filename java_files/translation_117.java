import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new ArrayList<>();
    Iterator<SpanQuery> it = getSpanQueries().listIterator();
    while (it.hasNext()) {
        SpanQuery spq = it.next();
        if (spq instanceof WeightedSpanQuery) {
            WeightedSpanQuery wsq = (WeightedSpanQuery) spq;
            if (wsq.getWeight() != 0.0) {
                it.remove();
            }
        }
        else if (spq instanceof ModifierQuery) {
            ModifierQuery mquery = (ModifierQuery)spq;
            if (mquery.getModifier() == ModifierQuery.Modifier.MOD_NOT) {
                it.remove();
            }
        }
        else {
            throw new RuntimeException("Unsupported SpanQuery node type: " + spq.getClass().getName());
        }
    }
    if (it.hasNext()) {
        throw new RuntimeException("Remaining spans have been removed: " + it.next());
    }
    return createSpanQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
}
}