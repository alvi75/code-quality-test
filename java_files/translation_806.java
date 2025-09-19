import java.util.*;

public class Translation806 {
    ublic final byte get() {
    if (position == limit) {
        throw new BufferUnderflowException();
    }
    return backingArray[offset + position++];
}
}