public QueryScorer( WeightedSpanTerm[] weightedTerms ){
    this.fieldWeightedSpanTerms = new HashMap<>();
    for (int i = 0;
    i < weightedTerms.length;
    i++) {
        WeightedSpanTerm existingTerm = this.fieldWeightedSpanTerms.get(weightedTerms[i].term);
        if ((existingTerm == null)|| (existingTerm.weight < weightedTerms[i].weight)) {
            this.fieldWeightedSpanTerms.put(weightedTerms[i].term, weightedTerms[i]);
            maxTermWeight = Math.max(maxTermWeight, weightedTerms[i].getWeight());
        }
    }
}