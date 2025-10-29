import java.util.*;

public class Translation655 {
    ublic static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparer) {
    TermStatsQueue tiq = null;
    if (field != null) {
        Fields fields = MultiFields.getFields(reader);
        if (fields == null) {
            throw new Exception("field " + field + " not found");
        }
        Terms terms = fields.getTerms(field);
        if (terms != null) {
            TermsEnum termsEnum = terms.getIterator(null);
            tiq = new TermStatsQueue(numTerms, comparer);
            tiq.fill(field, termsEnum);
        }
    }
    else {
        Fields fields = MultiFields.getFields(reader);
        if (fields == null) {
            throw new Exception("no fields found for this index");
        }
        tiq = new TermStatsQueue(numTerms, comparer);
        for (String fieldName : fields) {
            Terms terms = fields.getTerms(fieldName);
            if (terms != null) {
                tiq.fill(fieldName, terms.getIterator(null));
            }
        }
    }
    TermStats[] result = new TermStats[tiq.getCount()];
    int count = tiq.getCount() - 1;
    while (tiq.getCount() != 0) {
        result[count] = tiq.pop();
        count--;
    }
    return result;
}
}