import java.util.*;

public class Translation603 {
    1 public final int getInt(final int index) {
    2 checkIndex(index, SizeOf.INT);
    3 return Memory.peekInt(backingArray, offset + index, order);
}
}