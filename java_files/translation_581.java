import java.util.*;

public class Translation581 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED + RamUsageEstimator.shallowSizeOf(blocks);
    if (blocks.length > 0) {
        size += (blocks.length - 1) * bytesUsedPerBlock;
        size += RamUsageEstimator.sizeOf(blocks[blocks.length - 1]);
    }
    return size;
}
}