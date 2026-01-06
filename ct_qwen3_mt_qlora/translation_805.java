import java.util.*;

public class Translation805 {
    ublic IntBuffer slice() {
    return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position);
}
}