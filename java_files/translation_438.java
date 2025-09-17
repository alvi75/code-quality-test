import java.util.*;

public class Translationtranslation_438 {
    public long ramBytesUsed() {
        long size = BASE_RAM_BYTES_USED + RamUsageEstimator.shallowSizeOf(terms);
        if (terms.bytes != null) {
            size += terms.bytes.length * terms.bytes.offset;
            size += terms.docFreq * terms.docFreqNorm;
        }
        return size;
    }
}