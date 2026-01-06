import java.util.*;

public class Translation684 {
    public static BufferSize automatic() {
    long max, total, free;
    try (Process proc = Runtime.getRuntime().exec("tasklist")) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split("\\s+");
            if (parts.length >= 5 && parts[0].equals("System") && parts[3].equals("PID") && parts[4].equals("MEM")) {
                max = Long.parseLong(parts[7]);
                total = Long.parseLong(parts[8]);
                free = Long.parseLong(parts[9]);
                break;
            }
        }
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
    return new BufferSize(Math.min(Integer.MAX_VALUE, sortBufferByteSize));
}
}