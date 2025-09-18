import java.util.*;

public class Translation655 {
    public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
    final TermStats[] terms = getHighFreqTerms(reader, numTerms, field);
    Arrays.sort(terms, 0, terms.length, comparator);
    return terms;
}
}