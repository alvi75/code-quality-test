import java.util.*;

public class Translation976 {
    public static ByteBuffer allocateDirect(int capacity) {
    if (capacity < 0) throw new IllegalArgumentException();
    return new ReadWriteDirectByteBuffer(capacity);
}
}