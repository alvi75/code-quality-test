import java.util.*;

public class Translation526 {
    2 public static FloatBuffer allocate(int capacity) {
    3 if (capacity < 0)4 throw new IllegalArgumentException();
    5 return new ReadWriteFloatArrayBuffer(capacity);
}
}