import java.util.*;

public class Translation581 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    for (final SegmentInfo si : segments.values()) {
        size += si.ramBytesUsed();
    }
    return size;
}
}