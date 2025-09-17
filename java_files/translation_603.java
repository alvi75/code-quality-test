import java.util.*;

public class Translationtranslation_603 {
    public final int getInt(int index) {
        checkIndex(index, SizeOf.INT);
        return Memory.peekInt(backingArray, offset + index, order);
    }
}