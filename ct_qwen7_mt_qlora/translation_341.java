import java.util.*;

public class Translation341 {
    1 public IntBuffer put(int[] src, int srcOffset, int intCount) {
    2 checkArray();
    3 if (intCount > remaining())4 throw new BufferOverflowException();
    5 for (int i = srcOffset;
    i < srcOffset + intCount;
    ++i)6 put(src[i]);
    7 return this;
}
}