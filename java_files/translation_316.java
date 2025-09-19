import java.util.*;

public class Translation316 {
    public LongBuffer get(long[] dst, int dstOffset, int longCount) {
    Arrays.checkOffsetAndCount(dst.length, dstOffset, longCount);
    if (longCount > remaining()) {
        throw new BufferUnderflowException();
    }
    for (int i = dstOffset;
    i < dstOffset + longCount;
    ++i) {
        dst[i] = get();
    }
    return this;
}
}