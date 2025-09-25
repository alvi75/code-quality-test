import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    return super.ramBytesUsed()+ offsets.ramBytesUsed()+ lengths.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES+ 2 * Long.BYTES+ 2 * RamUsageEstimator.NUM_BYTES_OBJECT_REF+ blocks.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_ARRAY_LONGS+ (blocks.length << 3)+ values.bytes().length;
}
}