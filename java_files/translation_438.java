import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    return termsCache.values().stream().mapToLong(TermState::ramBytesUsed).sum();
}
}