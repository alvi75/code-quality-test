import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    final long max, total, free;
    try {
        final OperatingSystemMXBean osmxb = ManagementFactory.getOperatingSystemMXBean();
        max = osmxb.getMaxPhysicalMemorySize();
        total = osmxb.getTotalPhysicalMemorySize();
        free = osmxb.getFreePhysicalMemorySize();
    }
    catch (Throwable t) {
        return new BufferSize(32 * MB);
    }
    final long totalAvailableBytes = max - total + free;
    final long sortBufferByteSize = totalAvailableBytes / 2;
    if (sortBufferByteSize < MIN_BUFFER_SIZE_MB * MB) {
        sortBufferByteSize = MIN_BUFFER_SIZE_MB * MB;
    }
    return new BufferSize(Math.min(Integer.MAX_VALUE, sortBufferByteSize));
}
}