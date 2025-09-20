import java.util.*;

public class Translation655 {
    public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) {
    TermStatsQueue tiq = null;
    if (field != null) {
        final Fields fields = MultiFields.getFields(reader);
        if (fields == null) {
            throw new RuntimeException("field " + field + " not found");
        }
        final Terms terms = fields.getTerms(field);
        if (terms != null) {
            tiq = new TermStatsQueue(numTerms, comparator);
            tiq.fill(field, terms.iterator());
        }
    }
    else {
        final Fields fields = MultiFields.getFields(reader);
        if (fields == null) {
            throw new RuntimeException("no fields found for this index");
        }
        tiq = new TermStatsQueue(numTerms, comparator);
        for (String fieldName : fields.keySet()) {
            final Terms terms = fields.get(fieldName);
            if (terms != null) {
                tiq.fill(fieldName, terms.iterator());
            }
        }
    }
    final TermStats[] result = new TermStats[tiq.size()];
    int count = result.length - 1;
    while (!tiq.isEmpty()) {
        result[count--] = tiq.pop();
    }
    return result;
}
}