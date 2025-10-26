import java.util.*;

public class Translation805 {
    public IntBuffer slice() {
    return new ReadOnlyIntBufferImpl(remaining(), array, offset + position);
}
}