import java.util.*;

public class Translation655 {
    public static final TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) {
    TermStatsQueue tiq=null;
    if (field != null) {
        Fields f = reader.fieldsData(field);
        if (f==null) throw new IllegalArgumentException("field "+field+" does not exist!");
        Terms t = f.terms();
        if (t!=null) {
            TermsEnum termsEnum = t.iterator();
            tiq = new TermStatsQueue(numTerms, comparator);
            tiq.fill(termsEnum);
        }
    }
    else {
        Fields fields = reader.fieldsData();
        tiq = new TermStatsQueue(numTerms, comparator);
        for(String fieldName : fields.keySet()) {
            Terms t = fields.get(fieldName).terms();
            if (t!=null) {
                TermsEnum termsEnum = t.iterator();
                tiq.fill(fieldName, termsEnum);
            }
        }
    }
    final int size = tiq.size();
    TermStats[] array = new TermStats[size];
    for(int i=0;
    i<size;
    i++)array[i]=tiq.pop();
    return array;
}
}