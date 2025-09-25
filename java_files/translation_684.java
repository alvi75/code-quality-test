import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    final long max, total, free;
    try {
        final Process process = ProcessHandle.of(ProcessHandle.current().pid()).toProcess();
        max = process.getPeakVirtualMemorySizeLong();
        total = process.getVirtualMemorySizeLong();
        free = process.getPrivateMemoryInfo().getCommittedVirtualAddressSpace();
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
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