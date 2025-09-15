import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_117 {
    public SpanQuery makeSpanClause() {
        List<SpanQuery> spanQueries = new ArrayList<>();
        Iterator<WeightedSpanQuery> it = getWeightedSpanQueries().iterator();
        while (it.hasNext()) {
            WeightedSpanQuery wsq = it.next();
            if (wsq.getWeight() > 0) {
                spanQueries.add(wsq);
            }
        }
        if (spanQueries.size() == 1) {
            return spanQueries.iterator().next();
        }
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[0]));
    }
}