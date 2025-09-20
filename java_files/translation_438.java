import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    for (SimpleTextTerm t : terms.values()) {
        size += t.ramBytesUsed();
    }
    return size;
}
}