import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_655 {
    public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
        final TermStatsQueue tiq = new TermStatsQueue(numTerms, comparator);
        if (field != null) {
            final Fields fields = MultiFields.getFields(reader);
            if (fields == null) {
                throw new RuntimeException("index does not contain field:" + field);
            }
            for (String fn : fields.keySet()) {
                if (fn.equals(field)) {
                    final Terms terms = fields.get(fn);
                    if (terms != null) {
                        final TermsEnum termsEnum = terms.iterator();
                        Tq.fill(termsEnum, tiq);
                    }
                }
            }
            else {
                final Fields fields = MultiFields.getFields(reader);
                if (fields != null) {
                    for (String fn : fields.keySet()) {
                        if (fn.startsWith(field)) {
                            final Terms terms = fields.get(fn);
                            if (terms != null) {
                                final TermsEnum termsEnum = terms.iterator();
                                Tq.fill(termsEnum, tiq);
                            }
                        }
                    }
                    return tiq.getTerms();
                }
}