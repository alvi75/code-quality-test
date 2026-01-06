import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    return RamUsageEstimator.alignObjectSize(RamUsageEstimator.NUM_BYTES_OBJECT_HEADER)+ 2 * RamUsageEstimator.NUM_BYTES_INT32 + RamUsageEstimator.NUM_BYTES_OBJECT_REF + RamUsageEstimator.sizeOf(blocks);
}
}