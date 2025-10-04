import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    final long max, total, free;
    try {
        max = Runtime.getRuntime().peakMemoryUsage();
        total = Runtime.getRuntime().totalMemoryUsage();
        free = total - max;
    }
    catch (OutOfMemoryError notEnoughHeap) {
        free = Runtime.getRuntime().freeMemory();
    }
    final long totalAvailableBytes = max - total + free;
    final long sortBufferByteSize = free / 2;
    final long minBufferSizeBytes = MIN_BUFFER_SIZE_MB*MB;
    if (sortBufferByteSize < minBufferSizeBytes || totalAvailableBytes > 10*minBufferSizeBytes) {
        if (totalAvailableBytes / 2 > minBufferSizeBytes) {
            sortBufferByteSize = totalAvailableBytes / 2;
        }
        else {
            sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
        }
    }
    return new BufferSize(Math.min(sortBufferByteSize, Integer.MAX_VALUE));
}
}