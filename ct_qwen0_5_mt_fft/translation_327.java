import java.util.*;

public class Translation327 {
    public final long getLong() {
    final int newPosition = position + SizeOf.LONG;
    checkPosition(newPosition);
    final long result = Memory.peekLong(backingArray, offset + position, order);
    position = newPosition;
    return result;
}
}