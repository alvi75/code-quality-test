import java.util.*;

public class Translation684 {
    1 public static BufferSize automatic() {
    2 long max, total, free;
    3 try {
        4 final Runtime runtime = Runtime.getRuntime();
        5 max = runtime.maxMemory();
        6 total = runtime.totalMemory();
        7 free = runtime.freeMemory();
        8 }
        catch (final SecurityException e) {
            9 // if we can't get memory info then just use a small buffer size10 return new BufferSize(MIN_BUFFER_SIZE_MB * MB);
            11 }
            12 final long totalAvailableBytes = max - total + free;
            13 final long sortBufferByteSize = free / 2;
            14 final long minBufferSizeBytes = MIN_BUFFER_SIZE_MB * MB;
            15 if (sortBufferByteSize < minBufferSizeBytes || totalAvailableBytes > 10 * minBufferSizeBytes) {
                16 if (totalAvailableBytes / 2 > minBufferSizeBytes) {
                    17 sortBufferByteSize = totalAvailableBytes / 2;
                    18 }
                    else {
                        19 sortBufferByteSize = Math.max(ABSOLUTE_MIN_SORT_BUFFER_SIZE, sortBufferByteSize);
                        20 }
                        21 }
                        22 return new BufferSize(Math.min(Integer.MAX_VALUE, sortBufferByteSize));
                    }
}