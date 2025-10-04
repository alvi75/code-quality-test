import java.util.*;

public class Translation526 {
    public static FloatBuffer allocate(int capacity) {
    if (capacity < 0) {
        throw new IllegalArgumentException();
    }
    return new ReadWriteFloatArrayBuffer(capacity);
}
Create a function to calculate the sum of all elements in a given 2D array. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations.
}