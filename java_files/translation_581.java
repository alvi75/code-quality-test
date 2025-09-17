import java.util.*;

public class Translationtranslation_581 {
    public long ramBytesUsed() {
        long bytes = BASE_RAM_BYTES_USED + RamUsageEstimator.shallowSizeOf(blocks);
        if (blocks.length > 0) {
            bytes += (blocks.length - 1) * bytesPerBlock;
            bytes += RamUsageEstimator.sizeOf(blocks[blocks.length - 1]);
        }
        return bytes;
    }
}