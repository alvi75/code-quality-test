import java.util.*;

public class Translation117 {
    public SpanQuery makeSpanClause() {
    final List<SpanQuery> clauses = new ArrayList<>();
    for(Map.Entry<TermStats,Float> entry : stats.entrySet()) {
        clauses.add(new SpanTermQuery(entry.getKey().term));
    }
    return clauses.size()==1?clauses.get(0):new SpanOrQuery(clauses);
}
}