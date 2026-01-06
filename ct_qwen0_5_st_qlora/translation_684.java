import java.util.*;

public class Translation684 {
    public static BufferSize automatic() throws IOException {
    final long max, total, free;
    final Process proc = Process.current();
    max = proc.virtualMemory().get().total / 1024L / 1024L / 1024L;
    total = proc.virtualMemory().get().used / 1024L / 1024L;
    free = proc.virtualMemory().get().free / 1024L / 1024L;
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
    return new BufferSize(Math.min(Integer.MAX_VALUE, sortBufferByteSize));
}
}