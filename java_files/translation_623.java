import java.util.*;

public class Translationtranslation_623 {
    public long ramBytesUsed() {
        return super.ramBytesUsed()+ offsets.ramBytesUsed()+ lengths.ramBytesUsed()+ RamUsageEstimator.NUM_BYTES_OBJECT_HEADER+ 2 * Integer.BYTES+ 3 * RamUsageEstimator.NUM_BYTES_OBJECT_REF+ values.bytes().length;
    }
}