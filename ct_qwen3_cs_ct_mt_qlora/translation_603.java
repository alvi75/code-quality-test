import java.util.*;

public class Translation603 {
    2 public final int getInt(int index) {
    checkIndex(index, SizeOf.INT);
    return Memory.peekInt(backingArray, offset + index, order);
}
}