import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    long max, total, free;
    try (Process p = Runtime.getRuntime().exec("ps -o vsz -p " + ppid())) {
        p.waitFor();
        String line = p.getInputStream().readLine();
        if (line == null) {
            throw new IOException("No process information available");
        }
        String[] parts = line.split("\\s+");
        total = Long.parseLong(parts[1]);
        free = Long.parseLong(parts[2]);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
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