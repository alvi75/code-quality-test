import java.util.*;

public class Translation623 {
    ublic long ramBytesUsed() {
    return RamUsageEstimator.alignObjectSize(3 * RamUsageEstimator.NUM_BYTES_OBJECT_REF + 2 * RamUsageEstimator.NUM_BYTES_INT32) + RamUsageEstimator.sizeOf(data) + positions.ramBytesUsed() + wordNums.ramBytesUsed();
}
}