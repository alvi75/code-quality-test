import java.util.*;

public class Translation605 {
    public ByteBuffer putShort(int index, short value) {
    checkIndex(index, SizeOf.SHORT);
    Memory.pokeShort(backingArray, offset + index, value, order);
    return this;
}
}