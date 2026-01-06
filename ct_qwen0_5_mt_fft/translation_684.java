import java.util.*;

public class Translation684 {
    public static final BufferSize AUTOMATIC() {
    final long max, total, free;
    final Process p = Process.getCurrentProcess();
    max = p.getPeakVirtualMemorySize64();
    total = p.getVirtualMemorySize64();
    free = p.getPrivateMemorySize64();
    final long totalAvailableBytes = max - total + free;
    final long sortBufferByteSize = free / 2;
    final long minBufferSizeBytes = MIN_BUFFER_SIZE_MB * MB;
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