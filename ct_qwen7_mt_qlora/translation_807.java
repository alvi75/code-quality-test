import java.util.*;

public class Translation807 {
    1 public LongBuffer put(int index, long value) {
    2 checkIndex(index);
    3 backingArray[offset + index] = value;
    4 return this;
}
}