ublic SpanQuery makeSpanClause() {
    List<SpanQuery> spanQueries = new List<SpanQuery>();
    foreach (WeightedBySpanQuery wqs in weightBySpanQuery) {
        wqs.key.boost = wqs.value;
        spanQueries.add(wqs.key);
    }
    if (spanQueries.size() == 1) return spanQueries.get(0);
    else return new SpanOrQuery(spanQueries.toArray(new WeightedBySpanQuery[spanQueries.size()]));
}