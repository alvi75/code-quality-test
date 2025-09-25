import java.util.*;

public class Translation327 {
    public final long getLong() {
    if (_position + SizeOf.LONG > _limit) {
        throw new BufferUnderflowException();
    }
    long result = Memory.peekLong(backingArray, offset + position, order);
    position += SizeOf.LONG;
    return result;
}
}