import java.util.*;

public class Translation347 {
    public ShortBuffer get(ShortBuffer dst, int dstOffset, int shortCount) {
    if (shortCount > remaining()) {
        throw new BufferUnderflowException();
    }
    System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount);
    position += shortCount;
    return this;
}
}