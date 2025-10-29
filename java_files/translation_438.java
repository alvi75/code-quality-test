import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    return _termsCache.values().stream().mapToLong(Term::ramBytesUsed).sum();
}
}