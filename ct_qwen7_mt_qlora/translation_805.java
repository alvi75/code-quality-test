import java.util.*;

public class Translation805 {
    1 public IntBuffer slice() {
    2 return new ReadOnlyIntBufferImpl(limit - position, backingArray, offset + position);
}
}