ublic static TermStats[] GetHighFreqTerms(IndexReader reader, int numTerms, string field, IComparer<TermStats> comparer){
    TermStatsQueue tiq = null;
    if (field != null){
        Fields fields = MultiFields.GetFields(reader);
        if (fields == null){
            throw new Exception("field " + field + " not found");
        }
        Terms terms = fields.GetTerms(field);
        if (terms != null){
            TermsEnum termsEnum = terms.GetIterator(null);
            tiq = new TermStatsQueue(numTerms, comparer);
            tiq.Fill(field, termsEnum);
        }
        else{
            throw new Exception("no terms found for field " + field);
        }
    }
    else{
        Fields fields = MultiFields.GetFields(reader);
        if (fields == null){
            throw new Exception("no fields found for this index");
        }
        tiq = new TermStatsQueue(numTerms, comparer);
        foreach (string fieldName in fields){
            Terms terms = fields.GetTerms(fieldName);
            if (terms != null){
                tiq.Fill(fieldName, terms.GetIterator(null));
            }
        }
    }
    TermStats[] result = new TermStats[tiq.Count];
    int count = tiq.Count - 1;
    while (tiq.Count != 0){
        result[count] = tiq.Pop();
        count--;
    }
    return result;
}