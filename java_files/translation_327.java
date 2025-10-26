import java.util.*;

public class Translation327 {
    public final long getLong() {
    final int newPosition = position + SIZE_OF_LONG;
    if (newPosition > limit) {
        throw new BufferUnderflowException();
    }
    long result = Memory.peekLong(array, offset + position, order);
    position = newPosition;
    return result;
}
}