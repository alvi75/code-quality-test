import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long size = super.ramBytesUsed();
    for (SimpleTextTerms terms : _termsCache.values()) {
        if (terms != null) {
            size += terms.ramBytesUsed();
        }
    }
    return size;
}
}