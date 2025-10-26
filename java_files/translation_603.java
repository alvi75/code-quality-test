import java.util.*;

public class Translation603 {
    public final int getInt(final int index) {
    checkIndex(index, SizeOf.INT);
    return Memory.peekInt(backingArray, offset + index, order);
}
}