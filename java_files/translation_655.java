import java.util.*;

public class Translation655 {
    public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field) throws IOException {
    TermStatsQueue tiq = null;
    Fields fields = MultiFields.getFields(reader);
    if (fields == null) {
        throw new RuntimeException("No fields found for this index");
    }
    for(String fieldName : fields.keySet()) {
        Terms terms = fields.getTerms(fieldName);
        if(terms != null) {
            tiq = new TermStatsQueue(numTerms, new ReverseScoreTermComparator());
            for(Term t : terms) {
                String termText = t.text();
                if(termText.length() > 0) {
                    tiq.add(new TermStats(t, termText));
                }
            }
        }
    }
    TermStats[] result = new TermStats[numTerms];
    int count = numTerms-1;
    while (tiq.count > 0) {
        result[count] = tiq.pop();
        count--;
    }
    return result;
}
}