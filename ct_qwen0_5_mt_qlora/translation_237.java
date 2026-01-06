import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    return RamUsageEstimator.alignObjectSize(ramBytesUsed()) + RamUsageEstimator.sizeOf(blocks);
}
}