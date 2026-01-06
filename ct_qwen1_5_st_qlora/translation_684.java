import java.util.*;

public class Translation684 {
    public static BufferSize automatic() throws IOException {
    final long max, total, free;
    try (final Process process = Runtime.getRuntime().exec("free -m")) {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = reader.readLine();
        while (!line.isEmpty()) {
            line = reader.readLine();
        }
        reader.close();
        final String[] fields = line.split("\\s+");
        max = Long.parseLong(fields[1]);
        total = Long.parseLong(fields[2]);
        free = Long.parseLong(fields[3]);
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