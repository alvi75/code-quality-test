import java.util.*;

public class Translation623 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    size += (wordCount - 1) * WordBlock.ramBytesUsed();
    size += RamUsageEstimator.sizeOf(data);
    size += positions.ramBytesUsed();
    size += wordNums.ramBytesUsed();
    return size;
}
}