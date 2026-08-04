import java.util.*;

public class Translation327 {
    public final long getLong() {
    int newPosition = _position + SizeOf.LONG;
    if (newPosition > _limit) {
        throw new BufferUnderflowException();
    }
    long result = Memory.peekLong(backingArray, offset + _position, _order);
    _position = newPosition;
    return result;
}
}