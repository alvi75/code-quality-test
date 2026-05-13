import java.util.*;

public class Translation327 {
    1 public final long getLong() {
    2 int newPosition = position + SizeOf.LONG;
    3 if (newPosition > limit) {
        4 throw new BufferUnderflowException();
        5 }
        6 long result = Memory.peekLong(backingArray, offset + position, order);
        7 position = newPosition;
        8 return result;
    }
}