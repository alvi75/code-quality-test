import java.util.*;

public class Translation438 {
    ublic long ramBytesUsed() {
    return termsCache.values().stream().mapToLong(SimpleTextTerms::ramBytesUsed).sum();
}
}