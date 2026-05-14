import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    final long max, total, free;
    try (Process p = Runtime.getRuntime().exec("tasklist")) {
        max = Long.parseLong(p.getErrorStream().readLine());
        total = Long.parseLong(p.getErrorStream().readLine());
        free = Long.parseLong(p.getErrorStream().readLine());
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    final long sortBufferByteSize = free / 2;
    final long minBufferSizeBytes = MIN_BUFFER_SIZE_MB * MB;
    if (sortBufferByteSize < minBufferSizeBytes|| total > 10 * minBufferSizeBytes) {
        if (total / 2 > minBufferSizeBytes) {
            sortBufferByteSize = total / 2;
        }
        else {
            sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
        }
    }
    return new BufferSize(Math.min(Integer.MAX_VALUE, (int) sortBufferByteSize));
}
}