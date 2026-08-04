import java.util.*;

public class Translation806 {
    public final byte get() {
    if (position == limit) {
        throw new BufferUnderflowException();
    }
    return byteBuffer.get(position++);
}
}