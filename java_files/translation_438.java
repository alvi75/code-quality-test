import java.util.*;

public class Translation438 {
    ublic long ramBytesUsed() {
    return Arrays.stream(_termsCache.values()).mapToObj(TermsCache.SimpleTextTerm::ramBytesUsed).reduce(0L, Long::sum);
}
}