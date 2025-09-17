import java.util.*;

public class Translationtranslation_655 {
    public static TermStats[] getHighFreqTerms( IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator ){
        final TermStats[] terms = getHighFreqTerms(reader, numTerms, field);
        if ( terms==null ) {
            return null;
        }
        final TermStats[] result = new TermStats[terms.length];
        for (int i = 0;
        i < terms.length;
        i++) {
            result[i] = terms[i].copy();
        }
        return result;
    }
}