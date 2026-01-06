import java.util.*;

public class Translation726 {
    public CharBuffer put(char c) {
    int newPosition = position + SizeOf.CHAR;
    if (newPosition > limit) {
        throw new BufferOverflowException();
    }
    Memory.pokeShort(backingArray, offset + position, (short) c, order);
    position = newPosition;
    return this;
}
}