import java.util.*;

public class Translationtranslation_807 {
    public LongBuffer put(int index, long c) {
        checkIndex(index);
        backingArray[offset + index] = c;
        return this;
    }
}