import java.util.*;

public class Translation976 {
    public static ByteBuffer allocate(int capacity) {
    if (capacity < 0) {
        throw new IllegalArgumentException();
    }
    return new ReadWriteDirectByteBuffer(capacity);
}
}