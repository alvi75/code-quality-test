import java.util.*;

public class Translation526 {
    public FloatBuffer allocate(int capacity) {
    if (capacity < 0) {
        throw new IllegalArgumentException();
    }
    return new ReadWriteFloatArrayBuffer(capacity);
}
}