import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    long max, total, free;
    try {
        final Process proc = Process.getCurrentProcess();
        max = proc.getPeakVirtualMemorySize64();
        total = proc.getVirtualMemorySize64();
        free = proc.getPrivateMemorySize64();
    }
    catch (Throwable t) {
        logger.log(Level.WARNING, "Error getting peak memory usage", t);
        max = 0L;
        total = 0L;
        free = 0L;
    }
    long totalAvailableBytes = max - total + free;
    long sortBufferByteSize = free / 2;
    long minBufferSizeBytes = MIN_BUFFER_SIZE_MB * MB;
    if (sortBufferByteSize < minBufferSizeBytes || totalAvailableBytes > 10 * minBufferSizeBytes) {
        if (totalAvailableBytes / 2 > minBufferSizeBytes) {
            sortBufferByteSize = totalAvailableBytes / 2;
        }
        else {
            sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
        }
    }
    return new BufferSize(Math.min((long)Integer.MAX_VALUE, sortBufferByteSize));
}
}