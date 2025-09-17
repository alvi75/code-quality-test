import java.util.*;

public class Translationtranslation_526 {
    public static FloatBuffer allocate(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new ReadWriteFloatBuffer(capacity);
    }
}