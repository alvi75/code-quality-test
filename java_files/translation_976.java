import java.util.*;

public class Translation976 {
    public static ReadWriteHeapByteBuffer allocate(int capacity) {
    if (capacity < 0) {
        throw new IllegalArgumentException();
    }
    return new ReadWriteHeapByteBuffer(capacity);
}
}