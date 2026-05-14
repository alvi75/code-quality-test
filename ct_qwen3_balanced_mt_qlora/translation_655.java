import java.util.*;

public class Translation655 {
    ublic static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
    TermStatsQueue tiq = null;
    if (field != null) {
        final Fields fields = MultiFields.getFields(reader);
        if (fields == null) {
            throw new IllegalArgumentException("field " + field + " not found");
        }
        final Terms terms = fields.getTerms(field);
        if (terms != null) {
            final TermsEnum termsEnum = terms.iterator(null);
            tiq = new TermStatsQueue(numTerms, comparator);
            tiq.fill(field, termsEnum);
        }
    }
    else {
        final Fields fields = MultiFields.getFields(reader);
        if (fields == null) {
            throw new IllegalArgumentException("no fields found for this index");
        }
        tiq = new TermStatsQueue(numTerms, comparator);
        for (String fieldName : fields.fields()) {
            final Terms terms = fields.getTerms(fieldName);
            if (terms != null) {
                tiq.fill(fieldName, terms.iterator(null));
            }
        }
    }
    final TermStats[] result = new TermStats[tiq.size()];
    int count = result.length - 1;
    while (!tiq.isEmpty()) {
        result[count] = tiq.pop();
        count--;
    }
    return result;
}
}