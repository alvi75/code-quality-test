import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED;
    size += fields.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;
    size += formats.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;
    for(Map.Entry<String,FieldsProducer> entry: formats.entrySet()) {
        size += entry.getValue().ramBytesUsed();
    }
    return size;
}
}