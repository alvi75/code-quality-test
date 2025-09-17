import java.util.*;

public class Translationtranslation_655 {
    public static final TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
        final TermStats[] terms = new TermStats[numTerms];
        final TermStatsQueue queue = new TermStatsQueue(numTerms, comparator);
        final Collection<IndexCommit> commits = reader.commits();
        final AtomicReference<Exception> exc = new AtomicReference<>(null);
        for (final IndexCommit ic : commits) {
            new Thread() {
                @Override
}