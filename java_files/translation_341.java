import java.util.*;

public class Translation341 {
    public IntBuffer put(int[] src, int srcOffset, int intCount) {
    if (intCount > remaining()) {
        throw new BufferOverflowException();
    }
    System.arraycopy(src, srcOffset, array, position, intCount);
    position += intCount;
    return this;
}
}