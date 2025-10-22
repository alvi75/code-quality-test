import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    return termsCache.values().stream().mapToLong(simpleTextTerms -> (simpleTextTerms != null) ? simpleTextTerms.ramBytesUsed() : 0).sum();
}
}