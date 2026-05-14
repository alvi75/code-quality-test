import java.util.*;

public class Translation581 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED + (perFieldPostings!=null? perFieldPostings.ramBytesUsed() : 0);
    if (fieldInfos != null) {
        size += fieldInfos.ramBytesUsed();
    }
    return size;
}
}