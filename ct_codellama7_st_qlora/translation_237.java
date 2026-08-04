import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    return RamUsageEstimator.alignObjectSize(RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES+ RamUsageEstimator.NUM_BYTES_OBJECT_REF) + RamUsageEstimator.sizeOf(blocks);
}
}