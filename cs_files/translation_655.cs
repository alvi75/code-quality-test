using System;
using System.Collections.Generic;

public class Translation655
{
    public static TermStats[] GetHighFreqTerms(IndexReader reader, int numTerms, string field, IComparer<TermStats> comparer){
    TermStats[] terms = GetLowFreqTerms(reader, numTerms, field, comparer);
    if (terms.Length == 0){
        return null;
    }
    int highFreqCount = CountHighFrequencyTerms(terms, numTerms, field);
    var highFreqTerms = new List<TermStats>();
    for (int i = 0;
    i < terms.Length;
    i++){
        if (terms[i].Frequency > (numTerms * _threshold)){
            highFreqTerms.Add(terms[i]);
        }
    }
    highFreqTerms.Sort((x, y) => comparer.Compare(x, y));
    return highFreqTerms.ToArray();
}
}