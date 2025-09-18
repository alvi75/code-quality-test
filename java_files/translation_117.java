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
    else {
        return new SpanOrQuery(spanQueries.toArray(new SpanQuery[0]));
    }
}