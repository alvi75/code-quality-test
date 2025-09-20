import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    long size = RamUsageEstimator.sizeOf(data) + (blocks.length * RamUsageEstimator.NUM_BYTES_OBJECT_REF);
    for (int i = 0;
    i < blocks.length;
    i++) {
        size += RamUsageEstimator.sizeOf(blocks[i]);
    }
    return size;
}
}