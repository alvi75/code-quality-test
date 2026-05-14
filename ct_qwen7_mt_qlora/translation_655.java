import java.util.*;

public class Translation655 {
    2 public static TermStats[] getHighFreqTerms(3 IndexReader reader4 int numTerms5 String field6 Comparator<TermStats> comparer) {
    7 TermStatsQueue tiq = null;
    8 if (field != null) {
        9 Fields fields = MultiFields.getFields(reader);
        10 if (fields == null) {
            11 throw new RuntimeException("field " + field + " not found");
            12 }
            13 Terms terms = fields.terms(field);
            14 if (terms != null) {
                15 TermsEnum termsEnum = terms.iterator(null);
                16 tiq = new TermStatsQueue(numTerms, comparer);
                17 tiq.fill(field, termsEnum);
                18 }
                19 }
                else {
                    20 Fields fields = MultiFields.getFields(reader);
                    21 if (fields == null) {
                        22 throw new RuntimeException("no fields found for this index");
                        23 }
                        24 tiq = new TermStatsQueue(numTerms, comparer);
                        25 for (String fieldName : fields) {
                            26 Terms terms = fields.terms(fieldName);
                            27 if (terms != null) {
                                28 tiq.fill(fieldName, terms.iterator(null));
                                29 }
                                30 }
                                31 }
                                32 TermStats[] result = new TermStats[tiq.count()];
                                33 int count = tiq.count() - 1;
                                34 while (tiq.count() != 0) {
                                    35 result[count] = tiq.pop();
                                    36 count--;
                                    37 }
                                    38 return result;
                                }
}