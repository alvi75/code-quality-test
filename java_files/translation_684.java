import java.util.*;

public class Translation684 {
    ublic static BufferSize Automatic(){
    long max, total, free;
    using (Process proc = Process.GetCurrentProcess()){
        max = proc.PeakVirtualMemorySize64;
        total = proc.VirtualMemorySize64;
        free = proc.PrivateMemorySize64;
    }
    long totalAvailableBytes = max - total + free;
    long sortBufferByteSize = free / 2;
    long minBufferSizeBytes = MIN_BUFFER_SIZE_MB * MB;
    if (sortBufferByteSize < minBufferSizeBytes || totalAvailableBytes > 10 * minBufferSizeBytes) {
        if (totalAvailableBytes / 2 > minBufferSizeBytes) {
            sortBufferByteSize = totalAvailableBytes / 2;
        }
        else{
            sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
        }
    }
    return new BufferSize(Math.min((long)Integer.MAX_VALUE, sortBufferByteSize));
}
}