import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long ramBytesUsed = 0;
    for (Map.Entry<String, SimpleText> entry : _termsCache.entrySet()) {
        ramBytesUsed += entry.getValue().ramBytesUsed();
    }
    return ramBytesUsed;
}
}