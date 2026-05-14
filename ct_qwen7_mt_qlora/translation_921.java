import java.util.*;

public class Translation921 {
    1 public FloatBuffer slice() {
    2 return new ReadOnlyFloatBufferImpl(limit - position, backingArray, offset + position);
}
}