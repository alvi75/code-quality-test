import java.util.*;

public class Translation526 {
    ublic static FloatBuffer allocate(int capacity) {
    if (capacity < 0) {
        throw new IllegalArgumentException();
    }
    return new ReadWriteFloatArrayBuffer(capacity);
}
}