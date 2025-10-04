import java.util.*;

public class Translation655 {
    public static final TermStats[] getHighFreqTerms(IndexReader reader, int numTerms,String field, Comparator<TermStats> comparator) throws IOException {
    final TopFieldDocs tfds = getTopFieldDocs(reader, numTerms, field, comparator);
    final List<TermStats> terms = new ArrayList<>(tfds.totalHits);
    for(int i=0;
    i<tfds.totalHits;
    i++) {
        final TermStats stat = tfds.fields[i].stats;
        terms.add(stat);
    }
    Collections.sort(terms, comparator);
    return terms.toArray(new TermStats[0]);
}
}