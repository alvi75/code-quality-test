import java.util.*;

public class Translation976 {
    ublic static ByteBuffer allocate(int capacity) {
    if (capacity < 0) {
        throw new IllegalArgumentException();
    }
    return new ReadWriteHeapByteBuffer(capacity);
}
}