import java.util.*;

public class Translation655 {
    public static TermStats[] getHighFreqTerms(IndexReader reader, int numTerms, String field, Comparator<TermStats> comparator) throws IOException {
    final PriorityQueue<TermStats> queue = new PriorityQueue<>(numTerms, comparator);
    final IndexReaderContext context = DirectoryReader.indexReaderContextFromIndexReader(reader);
    final TermsEnum termsEnum = getTerms(reader, field);
    try {
        while (queue.size() < numTerms && termsEnum.next()) {
            final BytesRef term = termsEnum.term();
            final long docFreq = termsEnum.docFreq();
            final long totalTermFreq = termsEnum.totalTermFreq();
            queue.add(new TermStats(context, term, docFreq, totalTermFreq));
        }
        return queue.toArray(new TermStats[queue.size()]);
    }
    finally {
        IOUtils.closeWhileHandlingException(termsEnum);
    }
}
}