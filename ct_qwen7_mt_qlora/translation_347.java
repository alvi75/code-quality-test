import java.util.*;

public class Translation347 {
    1 public final ShortBuffer get(short[] dst,int dstOffset,int shortCount) {
    2 if (shortCount > remaining())3 throw new BufferUnderflowException();
    4 System.arraycopy(backingArray, offset + position, dst, dstOffset, shortCount);
    5 position += shortCount;
    6 return this;
}
}