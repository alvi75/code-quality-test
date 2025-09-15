import java.util.*;

public class Translationtranslation_327 {
    public final long getLong() {
        int newPosition = position + SizeOf.LONG;
        if (newPosition > limit) {
            throw new BufferUnderflowException();
        }
        long result = Memory.peekLong(backingArray, offset + position, order);
        position = newPosition;
        return result;
    }
}