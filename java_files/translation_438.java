import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_438 {
    public long ramBytesUsed() {
        long sizeInByes = BASE_RAM_BYTES_USED;
        sizeInByes += fields.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;
        sizeInByes += formats.size() * 2L * RamUsageEstimator.NUM_BYTES_OBJECT_REF;
        for(Map.Entry<String,FieldsProducer> entry: formats.entrySet()) {
            sizeInByes += entry.getValue().ramBytesUsed();
        }
        return sizeInByes;
    }
}