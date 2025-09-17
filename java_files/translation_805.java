import java.util.*;

public class Translationtranslation_805 {
    public IntBuffer slice() {
        return new ReadOnlyIntArrayBuffer(remaining(), backingArray, offset + position);
    }
}