import java.util.*;

public class Translationtranslation_806 {
    public final byte get() {
        if (position == limit) {
            throw new BufferUnderflowException();
        }
        return backingArray[offset + position++];
    }
}