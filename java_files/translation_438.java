import java.util.*;

public class Translation438 {
    public long ramBytesUsed() {
    long sizeInBytes = BASE_RAM_BYTES_USED;
    sizeInBytes += fields.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;
    sizeInBytes += formats.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;
    for(Map.Entry<String,FieldsProducer> entry: formats.entrySet()) {
        sizeInBytes += entry.getValue().ramBytesUsed();
    }
    return sizeInBytes;
}
}