import java.util.*;

public class Translation448 {
    public CharBuffer asReadOnlyBuffer() {
    CharToByteBufferAdapter buf = new CharToByteBufferAdapter(byteBuffer.asReadOnlyBuffer());
    buf.limit = limit;
    buf.position = position;
    buf.mark = mark;
    buf.byteBuffer.order = byteBuffer.order();
    return buf;
}
}