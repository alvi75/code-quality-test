import java.util.*;

public class Translation805 {
    public IntBuffer slice() {
    return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset+position);
}
}