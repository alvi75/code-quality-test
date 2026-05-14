import java.util.*;

public class Translation561 {
    public ByteBuffer putLong(int index, long value) {
    checkIndex(index, SizeOf.LONG);
    Memory.pokeLong(backingArray, offset + index, value, order);
    return this;
}
}