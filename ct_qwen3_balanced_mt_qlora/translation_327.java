import java.util.*;

public class Translation327 {
    ublic final long getLong() {
    final int newPosition = position + SizeOf.LONG;
    if (newPosition > limit) {
        throw new BufferUnderflowException();
    }
    final long result = Memory.peekLong(backingArray, offset + position, order);
    position = newPosition;
    return result;
}
}