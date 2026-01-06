import java.util.*;

public class Translation806 {
    1 public final int get() {
    if (position == limit) {
        throw new BufferUnderflowException();
    }
    return backingArray[offset + position++];
}
}