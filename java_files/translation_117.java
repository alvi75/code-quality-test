import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_117 {
    public SpanQuery makeSpanQuery() {
        List<SpanQuery> spanQueries = new ArrayList<>();
        for (Entry<String, Float> entry : weightBySpanQuery.entrySet()) {
            spanQueries.add(new SpanWeightedPhraseQuery(entry.getKey(), entry.getValue()));
        }
        if (spanQueries.size() == 1) {
            return spanQueries.get(0);
        }
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[spanQueries.size()]));
    }
}