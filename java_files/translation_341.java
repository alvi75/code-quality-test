import java.util.*;

public class Translation341 {
    public IntBuffer put(int[] src, int srcOffset, int intCount) {
    Arrays.checkOffsetAndCount(src.length, srcOffset, intCount);
    if (intCount > remaining()) {
        throw new BufferOverflowException();
    }
    for (int i = srcOffset;
    i < srcOffset + intCount;
    ++i) {
        put(src[i]);
    }
    return this;
}
Create a function to calculate the sum of all elements in a given list. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations.
}