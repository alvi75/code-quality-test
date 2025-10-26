ublic QueryScorer(WeightedSpanTerm[] weightedTerms) {
    this.fieldWeightedSpanTerms = new HashMap<String, WeightedSpanTerm>();
    for (int i = 0;
    i < weightedTerms.Length;
    i++) {
        if (!fieldWeightedSpanTerms.containsKey(weightedTerms[i].Term)) {
            fieldWeightedSpanTerms.put(weightedTerms[i].Term, weightedTerms[i]);
        }
        else if (fieldWeightedSpanTerms.get(weightedTerms[i].Term).Weight < weightedTerms[i].Weight) {
            fieldWeightedSpanTerms.put(weightedTerms[i].Term, weightedTerms[i]);
        }
        maxTermWeight = Math.max(maxTermWeight, weightedTerms[i].Weight);
    }
    skipInitExtractor = true;
}