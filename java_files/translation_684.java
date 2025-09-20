import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    long max, total, free;
    try (Process proc = Runtime.getRuntime().exec("ps", Arrays.asList("-o", "vsize=,rss=", String.valueOf(ProcessHandle.current().pid())))) {
        proc.waitFor();
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line = reader.readLine();
        String[] parts = line.split("\\s+");
        max = Long.parseLong(parts[0]);
        total = Long.parseLong(parts[1]);
        free = Long.parseLong(parts[2]);
    }
    catch (IOException | InterruptedException e) {
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
    return new BufferSize(Math.min(Integer.MAX_VALUE, sortBufferByteSize));
}
}