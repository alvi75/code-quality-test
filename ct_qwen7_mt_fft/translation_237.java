import java.util.*;

public class Translation237 {
    public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED + (blocks.size() * bytesUsedPerBlock);
    if (size > Integer.MAX_VALUE) {
        size = Integer.MAX_VALUE;
    }
    return (int) size;
}
}