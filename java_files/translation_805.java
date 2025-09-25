import java.util.*;

public class Translation805 {
    public IntBuffer slice() {
    return new ReadOnlyIntBufferImpl(remaining(), backingArray, offset + position);
}
}