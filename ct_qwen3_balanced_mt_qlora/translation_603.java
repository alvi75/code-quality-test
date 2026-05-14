import java.util.*;

public class Translation603 {
    ublic final int getInt(int index) {
    checkIndex(index, SizeOf.INT);
    return Memory.peekInt(backingArray, offset + index, order);
}
}