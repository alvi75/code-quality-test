import java.util.*;

public class Translationtranslation_964 {
    public ShortBuffer slice() {
        return new ReadWriteShortArrayBuffer(remaining(), backingArray, offset + position);
    }
}