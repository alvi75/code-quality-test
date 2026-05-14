import java.util.*;

public class Translation826 {
    1 public QueryScorer(SpanQuery[] queries) {
    2 this.queries = queries;
    3 this.scorer = new SpanMultiTermQueryWrapper<>(new TermQuery(new Term("dummy", "dummy")));
    4 this.termPositions = new int[queries.length][];
    5 this.termWeights = new float[queries.length];
    6 for (int i = 0;
    i < queries.length;
    i++) {
        7 termPositions[i] = new int[0];
        8 termWeights[i] = 1f;
        9 }
        10 }
}