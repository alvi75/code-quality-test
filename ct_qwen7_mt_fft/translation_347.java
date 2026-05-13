import java.util.*;

public class Translation347 {
    public final ShortBuffer get(short[] dst, int dstOffset, int shortCount) {
    if (shortCount > remaining()) {
        throw new BufferUnderflowException();
    }
    Arrays.copy(backingArray, offset + position, dst, dstOffset, shortCount);
    position += shortCount;
    return this;
}
}