import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED + terms.ramBytesUsed();
    if (hashTable != null) {
        size += hashTable.ramBytesUsed();
    }
    return size;
}
}