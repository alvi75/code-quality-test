import java.util.*;

public class Translation655 {
    public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
    TermStatsQueue tiq = null;
    final Set<String> seen = new HashSet<>();
    while (tqi != null && tiq.size() < numTerms) {
        final TermStats stats = tiq.pop();
        if (stats.field.equals(field)) {
            seen.add(stats.termtext);
            if (tqi == null) {
                tqi = new TermStatsQueue(10, comparator);
            }
            tqi.add(stats);
        }
    }
}