import java.util.*;

public class Translation623 {
    public long ramBytesUsed() {
    return RamUsageEstimator.alignObjectSize(3 * Integer.BYTES + 2 * Long.BYTES)+ RamUsageEstimator.sizeOf(data)+ positions.ramBytesUsed()+ wordNums.ramBytesUsed();
}
}