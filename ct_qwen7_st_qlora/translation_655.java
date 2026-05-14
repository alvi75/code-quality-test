import java.util.*;

public class Translation655 {
    public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms,String field, Comparator<TermStats> comparator)throws IOException {
    TermStatsQueue tiq = null;
    if (field!=null) {
        Fields fields = MultiFields.getFields(reader);
        if (fields==null) {
            throw new RuntimeException("field "+ field +" not found");
        }
        final Terms terms = fields.terms(field);
        if (terms==null) {
            return new TermStats[0];
        }
        final TermsEnum termsEnum = terms.iterator();
        tiq = new TermStatsQueue(numTerms, comparator);
        tiq.fill(field, termsEnum);
    }
    else {
        Fields fields = MultiFields.getFields(reader);
        if (fields==null) {
            throw new RuntimeException("no fields found for this index");
        }
        tiq = new TermStatsQueue(numTerms, comparator);
        for(String fieldName : fields.getFieldNames()) {
            final Terms terms = fields.terms(fieldName);
            if (terms==null) {
                continue;
            }
            final TermsEnum termsEnum = terms.iterator();
            tiq.fill(fieldName, termsEnum);
        }
    }
    final TermStats[] result = new TermStats[tiq.size()];
    int count=tiq.size()-1;
    while(tiq.size()!=0) {
        result[count]=tiq.pop();
        count--;
    }
    return result;
}
}