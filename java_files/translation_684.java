import java.util.*;

public class Translationtranslation_684 {
    public static BufferSize automatic() {
        final long max;
        final long total;
        final long free;
        try (final Process proc = Runtime.getRuntime().exec("free -m")) {
            final BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                if (line.startsWith("Mem")) {
                    final String[] parts = line.split(":");
                    free = Long.parseLong(parts[2], RADIX);
                    total = Long.parseLong(parts[1], RADIX);
                    max = Long.parseLong(parts[3], RADIX);
                }
                else if (line.startsWith("cache")) {
                    break;
                }
                else {
                    throw new RuntimeException("Unexpected output from 'free -m': " + line);
                }
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            in.close();
        }
        final long totalAvailableBytes = max - total + free;
        final long sortBufferByteSize = free / 2;
        final long minBufferSizeBytes = MIN_BUFFER_SIZE_MB*1024*1024;
        if (sortBufferByteSize < minBufferSizeBytes || totalAvailableBytes > 10*minBufferSizeBytes) {
            if (totalAvailableBytes / 2 > minBufferSizeBytes) {
                sortBufferByteSize = totalAvailableBytes/2;
            }
            else {
                sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
            }
        }
        return new BufferSize(sortBufferByteSize);
    }
}