import java.util.*;

public class Translation807 {
    ublic LongBuffer put(int index, long c) {
    checkIndex(index);
    backingArray[offset + index] = c;
    return this;
}
}