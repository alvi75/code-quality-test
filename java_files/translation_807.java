import java.util.*;

public class Translation807 {
    2 public LongBuffer put(int index, long c) {
    checkIndex(index);
    backingArray[offset + index] = c;
    return this;
}
}