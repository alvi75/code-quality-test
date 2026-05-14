import java.util.*;

public class Translation438 {
    1 public long ramBytesUsed() {
    2 return termsCache.values().stream().mapToLong(SimpleTextTerms::ramBytesUsed).sum();
}
}