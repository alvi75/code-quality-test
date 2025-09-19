import java.util.*;

public class Translation655 {
    public static final TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
    final TermStats[] terms = new TermStats[numTerms];
    final TermStatsQueue queue = new TermStatsQueue(numTerms, comparator);
    final Collection<IndexCommit> commits = reader.commits();
    final IndexSearcher searcher = null;
    final IndexReaderContext context = reader.getContext();
    try {
        for (final IndexCommit ic : commits) {
            searcher = IndexSearcherFactory.open(searcher, ic);
            final Terms terms = searcher.getTerms(field);
            if (terms != null) {
                final TermsEnum termsEnum = terms.iterator();
                while (termsEnum.hasNext()) {
                    final TermStats stat = new TermStats(termsEnum.next(), stat);
                    queue.updateTop(stat);
                }
            }
        }
    }
    finally {
        IOUtils.closeWhileHandlingException(searcher);
    }
    return terms;
}
}