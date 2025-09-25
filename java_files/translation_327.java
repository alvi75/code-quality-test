import java.util.*;

public class Translation327 {
    public long getLong() {
    int newPosition = position + LIBCORE_IO_SIZEOF.LONG;
    if (newPosition > limit) {
        throw new BufferUnderflowException();
    }
    long result = Memory.peekLong(backingArray, offset + position, order);
    position = newPosition;
    return result;
}
}