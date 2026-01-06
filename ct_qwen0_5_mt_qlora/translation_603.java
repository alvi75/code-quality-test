import java.util.*;

public class Translation603 {
    public int getInt(int index) {
    checkIndex(index, SizeOf.INT);
    return Memory.peekInt(backingArray, offset + index, order);
}
}