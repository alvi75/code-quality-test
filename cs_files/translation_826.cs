using System;
using System.Collections.Generic;

public class Translation826
{
    public QueryScorer(WeightedSpanTerm[] weightedTerms){
    this.fieldWeightedSpanTerms = new Dictionary<string, WeightedSpanTerm>();
    for (int i = 0;
    i < weightedTerms.Length;
    i++){
        if (!fieldWeightedSpanTerms.TryGetValue(weightedTerms[i].Field, out WeightedSpanTerm existingTerm)|| (existingTerm == null)|| (existingTerm.Weight < weightedTerms[i].Weight)){
            fieldWeightedSpanTerms[weightedTerms[i].Field] = weightedTerms[i];
            maxTermWeight = Math.Max(maxTermWeight, weightedTerms[i].Weight);
        }
    }
}
}