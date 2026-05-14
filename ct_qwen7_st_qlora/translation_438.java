import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    size += fields.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;
    if (!fields.isEmpty()) {
        final Iterator<Value> valuesItr = fields.values().iterator();
        while (valuesItr.hasNext()) {
            Value value = valuesItr.next();
            if (value.postingsArray!=null) {
                size += value.postingsArray.length*RamUsageEstimator.NUM_BYTES_OBJECT_REF;
            }
            else if (value.postingsList!=null) {
                size += value.postingsList.ramBytesUsed();
            }
        }
    }
    return size;
}
}